package kr.mjc.sehyuckpark.java.collections;

import java.util.ArrayList;
import java.util.List;


public class ListEx2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();

        list.add(new Point(2, 3));
        list.add(new Point(-5, 20));
        list.add(new Point(30, -8));
        System.out.println(list);
        // [Point{x=2, y=3}, Point{x=-5, y=20}, Point{x=30, y=-8}]

        list.remove(1);
        System.out.println(list); // [Point{x=2, y=3}, Point{x=30, y=-8}]

        Point p1 = list.get(1); //
        System.out.println(p1); // Point{x=30, y=-8}

        for (Point p : list) {
            System.out.println(p);
        }
    }
}
