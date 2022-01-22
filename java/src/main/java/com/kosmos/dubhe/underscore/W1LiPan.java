package com.kosmos.dubhe.underscore;


import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class W1LiPan {
    public static void main(String[] args) {
        shuffle1(0, 9, 3);
//       shuffle2(0, 9, 3);
    }

    // 有序随机取
    static void shuffle1(int j, int k, int n) {
        List<Integer> collect = Stream.iterate(j, item -> item + 1).limit(k).collect(Collectors.toList());
        Collections.shuffle(collect);
        collect.stream().limit(n).forEach(e -> System.out.println(e));
    }

    // 无序随机取
    static void shuffle2(int j, int k, int n) {
        new Random().ints(j, k).distinct().limit(n).forEach(e -> System.out.println(e));
    }

}
