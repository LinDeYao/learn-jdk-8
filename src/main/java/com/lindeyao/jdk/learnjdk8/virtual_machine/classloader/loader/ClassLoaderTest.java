package com.lindeyao.jdk.learnjdk8.virtual_machine.classloader.loader;

import java.io.IOException;
import java.io.InputStream;

/**
 * 演示：即使是全限定名相同的类，一旦加载类的类加载器不同，那么两个类就是属于不同的类
 * 类加载器和instanceof关键字演示
 * 自定义一个类加载器
 *
 * @author DeeLin
 * 2019-12-15 13:23
 */
public class ClassLoaderTest {

    public static void main(String[] args) throws Exception {
        ClassLoader myClassLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                InputStream is = null;
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    is = getClass().getResourceAsStream(fileName);
                    if (is == null) {
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    int result = is.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                } finally {
                    if (is != null) {
                        try {
                            // 关闭流动作
                            is.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };

        // 使用自定义的类加载器，加载同一类路径下的类
        Class<?> loadClass = myClassLoader.loadClass("com.lindeyao.jdk.learnjdk8.virtual_machine.classloader.loader.ClassLoaderTest");
        // 通过获取到类的Class对象，就可以通过类对象Class，创建实例对象。
        Object object = loadClass.newInstance();
        System.out.println(object.getClass());
        // false，表示生成的对象并不属于ClassLoaderTest类型，
        // 虽然类名相同，但是类的加载器不相同，也属于不同的类
        System.out.println(object instanceof ClassLoaderTest);
    }
}
