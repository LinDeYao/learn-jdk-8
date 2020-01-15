package com.lindeyao.jdk.learnjdk8.timeutil;

import java.time.LocalDate;
import java.time.LocalTime;

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
    }
}
