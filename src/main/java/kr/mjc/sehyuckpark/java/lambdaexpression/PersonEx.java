package kr.mjc.sehyuckpark.java.lambdaexpression;

import java.util.*;

public class PersonEx {

    public void printPersons(List<Person> roster, CheckPerson checkPerson) {
        for (Person person : roster) {
            if (checkPerson.test(person))
                System.out.println(person.toString());
        }
    }

    public void go() {
        Person p1 = new Person("IU", 1993, "iu@gmail.com");
        Person p2 = new Person("LeeSunGyun", 1975, "sun@naver.com");
        Person p3 = new Person("LeeJi-A", 1978, "lee@naver.com");

        List<Person> roster = new ArrayList<>();
        roster.add(p1);
        roster.add(p2);
        roster.add(p3);
        // [p1, p2, p3]

        System.out.println("Last Name is Lee");
        printPersons(roster, new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.getName().startsWith("Lee");
            }
        });

        System.out.println("Born over 1990");
        printPersons(roster, (Person p) -> {
            return p.getBirthyear() >= 1990;
        });

        System.out.println("Using G-mail");
        printPersons(roster, p -> p.getEmail().endsWith("gmail.com"));
    }

    public static void main(String[] args) {
        new PersonEx().go();
    }
}