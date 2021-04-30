package kr.mjc.sehyuckpark.java.collections.homework;

public class Student {
    String id;
    String name;
    String major;
    double score;

    public Student(String str) {
        String[] token = str.split("\t");
        id = token[0];
        name = token[1];
        major = token[2];
        score = Double.parseDouble(token[3]);
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" + "id='" + id + '\'' + ", name='" + name + '\'' +
                ", major='" + major + '\'' + ", score=" + score + '}';
    }
}