package kr.mjc.sehyuckpark.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx2 {
    public static void main(String[] args) {
        Map<String, Integer> scoreMap = new HashMap<>();

        scoreMap.put("KimSungDong", 97);
        scoreMap.put("HwangKiTae", 88);
        scoreMap.put("KimNamYoon", 98);
        scoreMap.put("LeeJaeMoon", 70);
        scoreMap.put("HanWonSun", 99);
        System.out.println(scoreMap);
        System.out.println("HashMap : " + scoreMap.size());

        System.out.println(scoreMap.get("LeeJaeMoon"));

        Set<String> keySet = scoreMap.keySet();
        for (String key : keySet) {
            int value = scoreMap.get(key);
            System.out.format("%s : %d\n", key, value);
        }

        Set<Map.Entry<String, Integer>> entrySet = scoreMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            //System.out.format("%s : %d\n", entry.getKey(), entry.getValue());
            System.out.println(entry);
        }
    }
}
