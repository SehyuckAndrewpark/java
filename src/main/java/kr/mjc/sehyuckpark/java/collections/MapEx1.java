package kr.mjc.sehyuckpark.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
    public static void main(String[] args) {
        Map<String, String> dic = new HashMap<>();

        dic.put("baby", "BABY");
        dic.put("love", "LOVE");
        dic.put("apple", "APPLE");
        System.out.println(dic);

        System.out.println(dic.get("baby"));
        System.out.println(dic.get("love"));
        System.out.println(dic.get("apple"));
    }
}
