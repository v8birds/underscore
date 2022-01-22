package com.kosmos.dubhe.underscore;

import com.github.underscore.lodash.U;

public class W1WeiXiang {
    public static void main(String args[]) {
        genRandomNum(1, 8, 3);
    }

    public static void genRandomNum(Integer j, Integer k, Integer n) {
        System.out.println(U.chain(U.range(j, k)).shuffle().take(n).value());
    }
}
