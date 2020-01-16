package com.lindeyao.jdk.learnjdk8.timeutil;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalField;

/**
 * java8专注处理日期--LocalDate
 * 相对比于Calendar类，既可以处理日期，也可以处理时间，而新的API，则分离成了两大类：
 * 专注处理日期：LocalDate
 * 专注处理时间：LocalTime
 * 处理日期和时间：LocalDateTime
 *
 * @author ldy
 * @create 2020-01-15 15:35
 */
public class LocalDateTest {

    public static void main(String[] args) {
        // 当前日期
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate.now() 返回的当前日期：" + localDate);
        // 显示指定年月日
        LocalDate localDateOf = LocalDate.of(2020, 01, 15);
        System.out.println("LocalDate.of 显示指定年月日：" + localDateOf);
        LocalDate localDateOfYearDay = LocalDate.ofYearDay(2020, 15);
        System.out.println("localDate.ofYearDay获取指定年份的第15天：" + localDateOfYearDay);
        LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(-10L);  // 格林时区：1970-01-01
        System.out.println("LocalDate.ofEpochDay指定相对于格林零时区的日偏移量：" + localDateOfEpochDay);

        System.out.println("getYear()方法，获取年份信息：" + localDate.getYear());
        System.out.println("getDayOfMonth()方法，获取当前天是月份的第几天：" + localDate.getDayOfMonth());
        System.out.println("getDayOfWeek()方法，获取当前天是星期几：" + localDate.getDayOfWeek());
        System.out.println("isLeapYear()方法，当前年份是不是闰年：" + localDate.isLeapYear());
        System.out.println("lengthOfYear()方法，当前年份有多少天：" + localDate.lengthOfYear());

        // 格式化日期时间格式：DateTimeFormatter
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println("localDate.format()方法，格式化时间为yyyy/MM/dd：" + localDate.format(format));

        // 设置对应日期对应部分(年月日，星期，月份的第几天)
        System.out.println("withDayOfMonth()，设置成月份的第28天:" + localDate.withDayOfMonth(28));

        // 日期相加减
        LocalDate localDatePlusDays = localDate.plusDays(1L);
        System.out.println("plusDays(),日期加上1天(值为负数则是减掉1天)：" + localDatePlusDays);

        // 日期比较
        boolean isAfter = localDatePlusDays.isAfter(localDate);
        System.out.println("isAfter(),时间相比较,第二天是否比今天大：" + isAfter);
    }
}
