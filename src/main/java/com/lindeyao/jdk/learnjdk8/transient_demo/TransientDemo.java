package com.lindeyao.jdk.learnjdk8.transient_demo;

import sun.misc.Launcher;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * transient关键字测试
 *
 * @author ldy
 * @create 2019-09-29 10:21
 */
public class TransientDemo {

    public static void main(String[] args) {
        User user = new User();
        user.setName("lindeyao");
        user.setPassword("123456");

        System.out.println("read before Serializable:");
        System.out.println(user.getName());
        System.out.println(user.getPassword());

        // 把对象保存到文件中，实体类已经实现了Serializable接口
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:/user.txt"));
            outputStream.writeObject(user);
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 从文件中读取出对象，反序列化
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("D:/user.txt"));
            user = (User) is.readObject();
            is.close();
            // 删除文件
            File file = new File("D:/user.txt");
            file.delete();

            System.out.println("read after Serializable: ");
            System.out.println("username: " + user.getName());
            System.err.println("password: " + user.getPassword());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //HashSet
        //TreeSet
        //Object
        //HashMap

        // 获取默认的类加载器
        ClassLoader classLoader = TransientDemo.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());

    }

}
