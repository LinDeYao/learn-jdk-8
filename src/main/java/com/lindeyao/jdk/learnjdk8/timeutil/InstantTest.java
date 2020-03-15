package com.lindeyao.jdk.learnjdk8.timeutil;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Java8日期时间API--表示时刻的 Instant
 *
 * @author ldy
 * @create 2020-01-15 14:58
 */
public class InstantTest {

    public static void main(String[] args) {
        // Instant 和 Date 一样，表示一个时间戳，用于描述一个时刻。
        Instant instant = Instant.now();
        System.out.println("Instant 表示当前时间：" + instant);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        Instant ofEpochSecondInstant = Instant.ofEpochSecond(10, 100);
        System.out.println("Instant ofEpochSecond 10秒+100纳秒为：" + ofEpochSecondInstant);
        Date date = new Date();
        System.out.println("日期时间Date为：" + date);
    }

    /**
     * 从上面的输出结果可以看出：
     * Instant表示的是某一个时刻，比如：2020-01-15T07:20:12.313Z，跟时区无关，都是从格林零时：1970-01-01T00:00:00Z开始计算起。
     * 所以，输出的结果永远都是：格林零时区所对应的时间
     * Date也表示某一个时刻，用法非常少，而且年、月、日、小时、分钟和秒值的方法都已废弃。
     */
}
