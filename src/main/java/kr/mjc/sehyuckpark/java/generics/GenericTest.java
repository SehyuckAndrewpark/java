package kr.mjc.sehyuckpark.java.generics;

@SuppressWarnings("all")
public class GenericTest {

    public static void main(String[] args) {

        // 1. Not use Generic
        SimpleBox box = new SimpleBox();
        box.set(5); // promotion. Integer -> Object
        Integer n1 = (Integer) box.get(); // type casting. Object -> Integer

        box.set("iu");
        String s1 = (String) box.get();

        // 2. Use Generic
        // Integer : type argument
        // Box<Integer> : Box of Integer. parameterized type
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(5);
        Integer n2 = integerBox.get();

        Box<String> stringBox = new Box<>();
        stringBox.set("iu");
        String s2 = stringBox.get();

        // 3. Raw Type Generic
        Box rawBox = new Box();
        rawBox.set(5);
        Integer n3 = (Integer) rawBox.get();
    }
}