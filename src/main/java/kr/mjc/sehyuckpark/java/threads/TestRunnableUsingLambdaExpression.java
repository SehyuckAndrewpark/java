package kr.mjc.sehyuckpark.java.threads;

public class TestRunnableUsingLambdaExpression {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }).start();
    }
}