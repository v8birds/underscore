package com.kosmos.dubhe.underscore;

import java.util.*;


public class W1HuoQi {
    public static List<Integer> getRandomNum(int j, int k, int n) {
        List<Integer> result = new ArrayList<>();
        new Random().ints(j, k + 1).distinct().limit(n).forEach(result::add);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getRandomNum(0, 10, 5));
    }

}
