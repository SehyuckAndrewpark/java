package kr.mjc.sehyuckpark.java.generics;

public class SimpleBox {

    private Object object;

    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }
}