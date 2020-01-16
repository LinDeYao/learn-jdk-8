package com.lindeyao.jdk.learnjdk8.timeutil;

import java.time.LocalTime;

/**
 * Java8日期时间API学习--LocalTime
 *
 * LocalTime：专注处理时间：包括时、分、秒和毫秒的处理。
 * API操作跟 LocalDate 差不多
 *
 * @author ldy
 * @create 2020-01-16 10:52
 */
public class LocalTimeTest {

    public static void main(String[] args) {
        // 创建当前时间，格式：10:57:53.328
        LocalTime localTime = LocalTime.now();
        System.out.println("获取当前系统默认时间：" + localTime);
        LocalTime localTimeOf = LocalTime.of(12, 20, 20, 1);
        System.out.println("LocalTime.of()自定义时间：" + localTimeOf);
        LocalTime localTimeOfSecondOfDay = LocalTime.ofSecondOfDay(10); // 当天开始时间：00:00:00 ，距当天凌晨多长：10，单位秒
        System.out.println("LocalTime.ofSecondOfDay()自定义距离当天凌晨的时间(秒为单位)：" + localTimeOfSecondOfDay);
        // with：设置时间:时分秒毫秒，并返回一个新的实例
        LocalTime localTimeWithHour = localTime.withHour(12);
        System.out.println("withHour(),设置时间的 ‘时’ 部分：" + localTimeWithHour);
    }

}
