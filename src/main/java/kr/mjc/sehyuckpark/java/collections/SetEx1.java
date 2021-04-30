package kr.mjc.sehyuckpark.java.collections;

import java.util.HashSet;
import java.util.Set;


public class SetEx1 {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        words.add("java");
        words.add("database");
        words.add("java");

        System.out.println(words); // [database, java]
        System.out.println(words.contains("java")); // true

        for (String element : words) {
            System.out.println(element);
        }
    }
}