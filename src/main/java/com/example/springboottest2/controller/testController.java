package com.example.springboottest2.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: springBootTest
 * @BelongsPackage: com.example.springboottest2.controller
 * @Author: 邵帅
 * @CreateTime: 2023-11-24
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
@RequestMapping("/test")
public class testController {
    /**
     * 中间操作会再次返回一个流，所以，我们可以链接多个中间操作， 注意这里是不用加分号的。
     * 下面的的filter 过滤，map 对象转换，sorted 排序，就属于中间操作。
     */
    public void test() {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream() // 创建流
                .filter(s -> s.startsWith("c")) // 执行过滤，过滤出以 c 为前缀的字符串
                .map(String::toUpperCase) // 转换成大写
                .sorted() // 排序
                .forEach(System.out::println); // for 循环打印
        /**
         * 终端操作是对流操作的一个结束动作，一般返回 void 或者一个非流的结果。
         * 上面的 forEach循环 就是一个终止操作。
         */

        /**
         * 并行流是通过多线程的方式来执行的，它能够充分发挥多核 CPU 的优势来提升性能。
         * 本文在最后再来介绍并行流，我们先讨论顺序流：
         */
        Arrays.asList("a1", "a2", "a3").stream() // 创建流
                .findFirst() // 找到第一个元素
                .ifPresent(System.out::println); // 如果存在，即输出

    }

    /**
     * 在集合上调用stream()方法会返回一个普通的 Stream 流。但是, 大可不必刻意地创建一个集合，再通过集合来获取 Stream 流，还可以通过如下这种方式：
     */
    public void stream() {
        Stream.of("a1", "a2", "a3")
                .findFirst()
                .ifPresent(System.out::println);
        
//IntStreams.range()方法还可以被用来取代常规的 for 循环, 如下所示：
        IntStream.range(1, 4)
                .forEach(System.out::println); // 相当于 for (int i = 1; i < 4; i++) {}


    }

}
