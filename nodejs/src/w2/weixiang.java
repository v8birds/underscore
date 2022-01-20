public static void main(String args[]) {
    List<Map> maps = new ArrayList<>();
    maps.add(U.toMap((new LinkedHashMap<String, String>() { {
        put("code", "a");
        put("b", "西瓜");
        put("c", "3");
    }}).entrySet()));
    maps.add(U.toMap((new LinkedHashMap<String, String>() { {
        put("code", "b");
        put("b", "苹果");
        put("c", "13");
    }}).entrySet()));
    maps.add(U.toMap((new LinkedHashMap<String, String>() { {
        put("code", "c");
        put("b", "葡萄");
        put("c", "23");
    }}).entrySet()));
    maps.add(U.toMap((new LinkedHashMap<String, String>() { {
        put("code", "d");
        put("b", "桃子");
        put("c", "33");
    }}).entrySet()));
    maps.add(U.toMap((new LinkedHashMap<String, String>() { {
        put("code", "e");
        put("b", "樱桃");
        put("c", "43");
    }}).entrySet()));
    maps.add(U.toMap((new LinkedHashMap<String, String>() { {
        put("code", "f");
        put("b", "哈密瓜");
        put("c", "53");
    }}).entrySet()));

    printMap(maps);
}


public static void printMap(List<Map> maps) {
    System.out.println(U.toMap(U.chain(maps).map(item -> Tuple.<String,String>create(item.get("code").toString(), item.get("b").toString())).value()));
}