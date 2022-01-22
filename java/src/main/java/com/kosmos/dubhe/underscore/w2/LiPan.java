package com.kosmos.dubhe.underscore.w2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LiPan {
    public static void main(String[] args) {
        shuffle3();
    }
    static void shuffle3() {
        HashMap<String, String> m1 = new HashMap<>();
        m1.put("code", "a");
        m1.put("b", "西瓜");
        m1.put("c", "3");

        HashMap<String, String> m2 = new HashMap<>();
        m2.put("code", "b");
        m2.put("b", "苹果");
        m2.put("c", "13");

        HashMap<String, String> m3 = new HashMap<>();
        m3.put("code", "c");
        m3.put("b", "葡萄");
        m3.put("c", "23");
        List<Map<String, String>> hashMaps = Arrays.asList(m1, m2, m3);

        Map<String, String> collect = hashMaps.stream().collect(Collectors.toMap(item -> item.get("code"), item -> item.get("b")));
        System.out.println(collect); // {a=西瓜, b=苹果, c=葡萄}
    }
}
    
