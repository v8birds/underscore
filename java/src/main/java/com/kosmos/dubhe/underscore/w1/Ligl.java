package com.kosmos.dubhe.underscore.w1;

import java.util.Random;

/**
 * @ClassName w1
 * @Description TODO
 * @Author 李光亮
 * @Date 2022/1/24 9:19
 */
public class Ligl {

    public static void main(String[] args) {
        new Random().ints(0, 99).distinct().limit(5).forEach(System.out::println);
    }
}
