package com.training.java9.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamImprovements {

    public static void main(String[] args) {
        //takeWhile method
        Stream.of(1,2,3,4,5,6,7,8,9).takeWhile(i -> i < 5).forEach(System.out::print);
        System.out.println();
        //dropWhile method
        Stream.of(1,2,3,4,5,6,7,8,9).dropWhile(i -> i < 5).forEach(System.out::print);
        System.out.println();
        //overloaded iterate method
        Stream.iterate(0, i -> i < 10, i -> i+1).forEach(System.out::print);
        System.out.println();
        //ofNullable method
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,10);

        Stream.of(1,2,3,4).flatMap(value -> Stream.ofNullable(map.get(value))).forEach(System.out::println);


    }
}
