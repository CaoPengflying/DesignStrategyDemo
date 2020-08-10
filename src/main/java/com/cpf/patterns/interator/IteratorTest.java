package com.cpf.patterns.interator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 * 迭代器模式
 * 迭代器模式（Iterator Pattern）是 Java 和 .Net
 * 编程环境中非常常用的设计模式。
 * 这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 */
public class IteratorTest {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
