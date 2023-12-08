package com.example.springboottest2.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @BelongsProject: springBootTest
 * @BelongsPackage: com.example.springboottest2.controller
 * @Author: 邵帅
 * @CreateTime: 2023-12-06
 * @Description: TODO
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
class testControllerTest {
    int n =0;

    @BeforeEach
    void setUp() {
        System.out.println("第"+n+1+"个开始");
    }

    @Test
    void test1() {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream() // 创建流
                .filter(s -> s.startsWith("c")) // 执行过滤，过滤出以 c 为前缀的字符串
                .map(String::toUpperCase) // 转换成大写
                .sorted() // 排序
                .forEach(System.out::println); // for 循环打印
    }

    @Test
    void test2(){
        Arrays.asList("a1", "a2", "a3").stream() // 创建流
                .findFirst() // 找到第一个元素
                .ifPresent(System.out::println); // 如果存在，即输出
    }
    @Test
    void stream() {
        Stream.of("a1", "a2", "a3")
                .findFirst()
                .ifPresent(System.out::println);
    }
    @Test
    void test3(){
        //IntStreams.range()方法还可以被用来取代常规的 for 循环, 如下所示：
        IntStream.range(1, 4)
                .forEach(System.out::println); // 相当于 for (int i = 1; i < 4; i++) {}
    }
    @AfterEach
    void tearDown() {
        System.out.println("第"+n+1+"个结束");
        ++n;
    }
}