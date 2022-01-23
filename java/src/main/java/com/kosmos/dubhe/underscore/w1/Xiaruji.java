package com.kosmos.dubhe.underscore.w1;

import com.github.underscore.lodash.U;

/**
 * @author xiaji
 * @date 1/23/22 6:10 PM
 * @description: 从[J ~ K]数组中选取N个随机数
 * ### 参数为 J, K, N
 * ### N 小于 K-J
 * ### 结果不能包含重复数字
 **/

public class Xiaruji {

    public static void main(String[] args) {
        getRandomNum(1,8,5);
    }

    public static void getRandomNum(Integer j, Integer k, Integer n) {
        System.out.println(U.chain(U.range(j,k)).shuffle().take(n).value());
    }
}
