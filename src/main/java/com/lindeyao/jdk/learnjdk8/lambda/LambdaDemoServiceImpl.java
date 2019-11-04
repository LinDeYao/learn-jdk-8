package com.lindeyao.jdk.learnjdk8.lambda;

import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author ldy
 * @create 2019-09-03 17:41
 */
@Service
public class LambdaDemoServiceImpl implements LambdaDemoService {

    @Override
    public void LambdaDemo() {
        /*Arrays.asList("a", "b", "c").forEach((e) -> System.out.println(e));

        Arrays.asList("1","3","2").forEach((String e) -> System.out.println(e));*/

        // 练习lambda表达式,旧方法
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread");
            }
        }).start();
        // 新写法
        new Thread(() -> System.out.println("Hello from thread")).start();

        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            return result;
        } );

        //LinkedList

        //HashSet

        /*
        // old way
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for (Integer i : list) {
            System.out.println(i);
        }

        // new way
        List<Integer> newList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        newList.forEach(i -> System.out.println(i));
        // or we can user :: double colon operator in java8
        newList.forEach(System.out :: println);*/
    }

    @Override
    public void clockDemo() {
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());


        LocalDate date = LocalDate.now();
        System.out.println(date);
        int year = date.getYear();
        System.out.println(year);

        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.toString());
        System.out.println(dateTime.getYear());

        LocalDateTime dateTime2 = dateTime.plusYears(1L);
        System.out.println(dateTime2.getYear());

        String datatime = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(datatime);

        String aa = new Random().nextInt(900)+100+""+Clock.systemUTC().millis();
        System.out.println(aa);

        String birth = "445222199011254054".substring(10, 12);
        System.out.println(birth);
    }

    @Override
    public void base64Demo() {
        String text = "Base64 finally in Java 8!";
        String encode = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(encode);

        String decode = new String(Base64.getDecoder().decode(encode.getBytes(StandardCharsets.UTF_8)));
        System.out.println(decode);
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        /*System.out.println("Print all numbers:");
        evaluate(list, (n)-> true);*/

        List<Integer> list1 = new ArrayList(list);
        System.out.println(list1);
        list1.removeIf( n-> { return n%2==0; });
        System.out.println(list1);


        List<String> strings = Arrays.asList( "3", "1", "2" );
        strings.sort( ( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            return result;
        } );

        System.out.println(strings);
    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {
            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }

    @Override
    public void FunctionInterfaceDemo() {
        FunctionalDefaultMethods methods = () -> System.out.println("haha");
        methods.method();
    }

    /**
     *
     * 测试流stream()
     * 作用是将集合看成一种流，流在管道中传输，可以再管道的节点上进行处理，比如筛选、排序、聚合等(跟数据库的操作集合相似)
     * 生成流的两种方式：
     * stream() − 为集合创建串行流。
     * parallelStream() − 为集合创建并行流。
     *
     * mapToxx:表示执行stream中每一个Object的方法得到一个xx集合。
     */
    @Override
    public void streamDemo() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> list = numbers.stream().limit(8).filter(n->n>3).sorted().collect(Collectors.toList());
        System.out.println(list);
    }
}
