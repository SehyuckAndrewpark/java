package kr.mjc.sehyuckpark.java.collections;

import java.util.HashSet;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        Set<Point> points = new HashSet<>();
        Point p1 = new Point(3, 4);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(1, 2);
        points.add(p1);
        points.add(p2);
        points.add(p3);
        System.out.println(points);

        System.out.println(p2.equals(p3));
        System.out.format("p2.hashCode()=%d, p3.hashCode()=%d\n", p2.hashCode(),
                p3.hashCode());
    }
}