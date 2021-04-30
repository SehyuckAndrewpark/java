package kr.mjc.sehyuckpark.java.collections;

import java.util.ArrayList;
import java.util.List;


public class ListEx1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5); // 5
        list.add(4); // 4
        list.add(-1); // -1
        System.out.println(list); // [5,4,-1]

        list.add(2, 100);
        System.out.println(list); // [5, 4, 100, -1]
        System.out.println("List Elements : " + list.size());

        System.out.println(list.get(3)); // -1

        for (Integer m : list) {
            System.out.format("%d ", m);
        }
        System.out.println();
    }
}
