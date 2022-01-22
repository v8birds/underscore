package com.kosmos.dubhe.underscore.w2;

import java.util.*;
import java.util.stream.Collectors;
public class HuoQi {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("code", "a");
        map1.put("b", "西瓜");
        map1.put("c", "3");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("code", "b");
        map2.put("b", "苹果");
        map2.put("c", "13");
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("code", "c");
        map3.put("b", "葡萄");
        map3.put("c", "23");
        HashMap<String, String> map4 = new HashMap<>();
        map4.put("code", "d");
        map4.put("b", "桃子");
        map4.put("c", "33");
        HashMap<String, String> map5 = new HashMap<>();
        map5.put("code", "e");
        map5.put("b", "樱桃");
        map5.put("c", "331");
        HashMap<String, String> map6 = new HashMap<>();
        map6.put("code", "f");
        map6.put("b", "哈密瓜");
        map6.put("c", "43");
        List<HashMap<String, String>> mapList = Arrays.asList(map1, map2, map3, map4, map5, map6);
        Map<String, String> map = mapList.stream().collect(Collectors.toMap(m -> m.get("code"), m -> m.get("b")));
        System.out.println(map);
    }
}