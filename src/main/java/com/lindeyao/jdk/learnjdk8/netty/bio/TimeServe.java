package com.lindeyao.jdk.learnjdk8.netty.bio;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Java BIO（Block IO）阻塞IO例子：server端
 * 同步阻塞IO的TimeServer
 *
 * @author ldy
 * @create 2020-05-19 11:02
 */
public class TimeServe {

    public static void main(String[] args) throws IOException {
        int port = 8080;

        ServerSocket server = null;
        try {
            server = new ServerSocket(port);
            System.out.println("The time server is start in port : " + port);
            Socket socket = null;
            while (true) {
                socket = server.accept();
                new Thread(new TimeServerHandler(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(server != null) {
                System.out.println("The time server close");
                server.close();
                server = null;
            }
        }
    }

    // 总结： 启动Server端和启动Client端，从结果可以看出，传统的阻塞IO，一个链路（socket）对应着一个处理线程。
    // 而线程又是服务器非常宝贵的资源，一旦并发量增大，服务器的处理性能会急剧下降，最严重的结果会造成宕机甚至死机。
    // 为了改进一个线程只能处理一个客户端连接的模型，后来又演进出了一种通过 线程池 和 消息队列 实现1个或者多个线程
    // 处理N个客户端的模型。由于它的底层通讯机制依然使用同步阻塞IO，所以被称为"伪异步"。

}
