package com.lindeyao.jdk.learnjdk8.timeutil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Java8日期时间API--ZonedDateTime：时区相关的日期时间处理
 *
 * 无论是我们的 LocalDate，或是 LocalTime，甚至是 LocalDateTime，它们基本是时区无关的
 * ZonedDateTime 可以理解为 LocalDateTime 的外层封装，内部存储了一个 LocalDateTime 的实例
 * 与LocalDateTime的区别在于：当指定了ZoneId和ZoneOffset来描述时区的概念，就算换了市区，时间也不会改变。
 * 所以，LocalDateTime的缺点在于：往往换一个时区可能就会导致程序中的日期时间不一致，当然，不出国门，默认大陆的时区都是标准的Asia/Shanghai。
 *
 * 日期+时区 本就已经唯一确定了某个时刻，就相当于我在存储某个时刻的时候，我说明了这是某某时区的某某时间
 *
 * @author ldy
 * @create 2020-01-16 11:33
 */
public class ZonedDateTimeTest {

    public static void main(String[] args) {

        // 获取携带了系统时区的系统默认 日期时间
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime.now()，获取携带系统默认的‘日期时间’：" + zonedDateTime);

        // 获取指定时区的日期时间: 美国时区时间 [America/Anchorage]
        ZoneId zoneId = ZoneId.of(ZoneId.SHORT_IDS.get("AST"));
        ZonedDateTime zonedDateTimeAmerica = ZonedDateTime.now(zoneId);
        System.out.println("指定美国时区时间：" + zonedDateTimeAmerica);

        // 格林时间 + 指定地区，则无论程序在哪个时区运行，时间都是一致的。
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        System.out.println("格林时间+指定时区，确定了日期时间点：" + zonedDateTimeOf);
    }

}
