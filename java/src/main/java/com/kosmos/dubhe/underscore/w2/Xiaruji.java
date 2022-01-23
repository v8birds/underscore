package com.kosmos.dubhe.underscore.w2;


import com.github.underscore.Tuple;
import com.github.underscore.lodash.U;
import lombok.val;

import java.util.*;


/**
 * @author xiaji
 * @date 1/23/22 6:10 PM
 * @description: ` [{code:'a', b:'西瓜', c:'3'},
 * {code:'b', b:'苹果', c:'13'},
 * {code:'c', b:'葡萄', c:'23'},
 * {code:'d', b:'桃子', c:'33'},
 * {code:'e', b:'樱桃', c:'331'},
 * {code:'f', b:'哈密瓜', c:'43'},
 * ]`
 * <p>
 * 输出
 * `{
 * a: '西瓜'，
 * b: '苹果'
 * …
 * }`
 **/

public class Xiaruji {

    public static void main(String[] args) {
        val m1 = new HashMap<String, String>();
        m1.put("code", "a");
        m1.put("b", "西瓜");
        m1.put("c", "3");

        val m2 = new HashMap<String, String>();
        m2.put("code", "b");
        m2.put("b", "苹果");
        m2.put("c", "13");

        val m3 = new HashMap<String, String>();
        m3.put("code", "c");
        m3.put("b", "葡萄");
        m3.put("c", "23");

        val m4 = new HashMap<String, String>();
        m4.put("code", "d");
        m4.put("b", "桃子");
        m4.put("c", "23");

        val listMap = Arrays.asList(m1, m2, m3, m4);

        getFruitMap(listMap);
    }

    public static void getFruitMap(List<HashMap<String, String>> listMap) {
        //List<Tuple<K, V>> tuples
        //Iterable<Map.Entry<K, V>> iterable
        System.out.println(U.toMap(
                U.chain(listMap).map(
                        f -> Tuple.create(f.get("code"), f.get("b"))
                ).value()
        ));
    }
}
