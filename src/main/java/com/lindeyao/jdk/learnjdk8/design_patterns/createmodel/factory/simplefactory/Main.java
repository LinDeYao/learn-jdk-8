package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 执行类
 *
 * @author ldy
 * @create 2020-08-11 11:40
 */
public class Main {

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("请输入第一位操作数字");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int numberA = Integer.parseInt(br.readLine());

            System.out.println("请输入第二位操作数字");
            int numberB = Integer.parseInt(br.readLine());

            System.out.println("请输入操作符");
            String operator = br.readLine();

            // 简单工厂模式，由工厂生产出对象
            AbstractOperation operation = OperationFactory.createOperation(operator);

            operation.setNumberA(numberA);
            operation.setNumberB(numberB);
            System.out.println(operation.getResult());

            System.out.println("是否继续y/n");
            String continueInput = br.readLine();
            if(!continueInput.equals("y")){
                break;
            }
        }
    }

}
