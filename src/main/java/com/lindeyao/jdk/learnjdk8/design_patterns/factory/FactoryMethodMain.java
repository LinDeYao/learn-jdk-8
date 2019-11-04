package com.lindeyao.jdk.learnjdk8.design_patterns.factory;

/**
 * 工厂方法模式--主执行类
 *
 * @author ldy
 * @create 2019-10-12 14:05
 */
public class FactoryMethodMain {

    public static void main(String[] args) {

        // pngReader
        FactoryMethod_ReaderFactory pngReaderFactory = new FactoryMethod_PngReaderFactory();
        FactoryMethod_Reader pngReader = pngReaderFactory.createReader();
        pngReader.read();

        // jpgReader
        FactoryMethod_ReaderFactory jpgReaderFacotry = new FactoryMethod_JpgReaderFacotry();
        FactoryMethod_Reader jpgReader = jpgReaderFacotry.createReader();
        jpgReader.read();

        /**
         * 总结：与简单工厂相比起来，简单工厂只有一个工厂类，工厂方法模式则将工厂类进行了抽象化，形成了一工厂接口。
         *      那么每个种类都会有对应一个实体工厂(而实体工厂则实现了工厂接口，接口中返回对应的实体对象)。
         *
         * 工厂方法适用场景：
         *      1：我们只需要知道对象所对应的工厂类，它能给我们提供想要的实体对象，而无须知道对应的类是什么。
         *      简单地说：我们只要知道类对应的工厂，我们就可以拿到类的实体对象
         *      2：客户端可以通过子类来指定创建对应的对象
         */

    }

}
