package com.lindeyao.jdk.learnjdk8.timeutil;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * Java8时间API--DateTimeFormatter：格式化日期时间
 * 相对于老版本的：DateFormat ，最大区别是：DateTimeFormatter是线程安全的。
 * DateFormat线程不安全：因为内部维护了一个Calendar对象，在多线程下可能会出现同时操作时间(同一个对象)，造成传递进去的数据跟操作后的数据不一致。
 *
 * 格式化主要有两种情况，一种是将日期时间格式化(format)成字符串，另一种则是将格式化后的字符串解析成(parse)日期时间对象。
 * DateTimeFormatter 提供format方法将日期时间格式化成字符串，
 * 但是解析成具体时间，建议使用对应日期时间类的 parse方法，比如：LocalDate.parse(),解析成LocalDate日期格式。
 * 如果使用 DateTimeFormatter.parse()方法，则需要进一步转换成对应的日期时间格式。如下面的例子所示：
 *
 * @author ldy
 * @create 2020-01-16 15:35
 */
public class DateTimeFormatterTest {

    public static void main(String[] args) {
        // 获取指定格式的日期时间格式转换对象,DateTimeFormatter定义了很多转换格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.BASIC_ISO_DATE;
        LocalDate currentLocalDate = LocalDate.now();
        String currentLocalDateStr = dateTimeFormatter.format(currentLocalDate);
        System.out.println("dateTimeFormatter.format()，日期时间转换成String：" + currentLocalDateStr);
        // String解释成时间方式一：采用对应日期时间类，这里使用LocalDate的静态方法：parse()进行 String转成对应的时间
        LocalDate localDate = LocalDate.parse(currentLocalDateStr, dateTimeFormatter);
        System.out.println("String解析成时间方式一：LocalDate.parse()方法：" + localDate);
        // String解析成时间方式二：采用dateTimeFormatter的：parse()方法，需要进行query转成对应日期时间
        LocalDate localDateParseFromStr = dateTimeFormatter.parse(currentLocalDateStr).query(LocalDate::from);
        System.out.println("String解析成时间方式二: DateTimeFormatter的parse()方法：" + localDateParseFromStr);
    }

}
