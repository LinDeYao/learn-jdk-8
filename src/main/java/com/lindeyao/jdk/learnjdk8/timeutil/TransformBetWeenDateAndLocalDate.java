package com.lindeyao.jdk.learnjdk8.timeutil;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * Date和LocalDate或者LocalDateTime互相转换
 *
 * @author ldy
 * @create 2020-01-17 10:15
 */
public class TransformBetWeenDateAndLocalDate {

    public static void main(String[] args) {
        // 前提条件：旧API:Date包含了日期+时间，而新的API：LocalDate只包含日期
        // 只有我们不关心时间的时候，也就是去掉时间部分的值，才可以进行相互类型转换

        // 日期时间转日期
        DateToLocalDate();
        // 日期转日期时间
        LocalDateToDate();  // 时分秒都是0
    }

    /**
     * Date 转成 LocalDate，步骤：
     * 1：将java.util.Date转换成Instant，然后获取对应的时区
     * 2：根据时间段跟时区，组合成 ZonedDateTime(中转者)
     * 3：使用ZonedDateTime的toLocalDate()方法获取 LocalDate
     * 实例如下：
     */
    private static void DateToLocalDate() {
        Date date = new Date();
        System.out.println("旧的API：Date转成新的日期API：Date：" + date);
        Instant instant = date.toInstant();  // Date先转成Instant，所以说Instant是用来替代Date的。
        ZoneId zoneId = ZoneId.systemDefault(); // 获取默认时区
        ZonedDateTime zonedDateTime = instant.atZone(zoneId); // 设置了包含了时区的日期时间
        LocalDate localDate = zonedDateTime.toLocalDate(); // 从包含了时区的日期时间获取对应的 日期
        System.out.println("旧的API：Date转成新的日期API：LocalDate：" + localDate);
    }

    /**
     * LocalDate 转 Date
     * 1：获取系统默认时区
     * 2：根据默认时区获取包装了 时区的日期时间 ZonedDateTime(中转者)
     * 3：根据ZonedDateTime的toInstant()方法，得到对应时间段:instant
     * 4：根据 Date.from(instant) 方法，将 instant 转成 Date 类型
     */
    private static void LocalDateToDate() {
        LocalDate localDate = LocalDate.now();
        System.out.println("新的API：LocalDate转成日期时间：LocalDate：" + localDate);
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(zoneId);
        Instant instant = zonedDateTime.toInstant();
        Date date = Date.from(instant);
        System.out.println("新的API：LocalDate转成日期时间：Date：" + date);
    }
}
