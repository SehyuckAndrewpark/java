package kr.mjc.sehyuckpark.java.collections.homework;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapOfStudentEx {

    Map<String, Student> studentMap = new HashMap<>();

    public static void main(String[] args) {
        MapOfStudentEx ex = new MapOfStudentEx();
        try {
            ex.read();
            ex.search();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void read() throws Exception {
        try (Scanner sc = new Scanner(
                new File("src/main/resources/students.txt"))) {

            while (sc.hasNextLine()) {
                Student student = new Student(sc.nextLine());
                studentMap.put(student.getId(), student);
            }
        }

        for (Map.Entry<String, Student> entry : studentMap.entrySet())
            System.out.println(entry.getValue());

    }

    public void search() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nType Id : ");
            String id = sc.next();
            Student student = studentMap.get(id);
            System.out.println(student);
        }
    }
}
