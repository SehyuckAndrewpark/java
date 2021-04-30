package kr.mjc.sehyuckpark.java.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;


public class DequeEx {
    public static void main(String[] args) {

        // 1. Queue test
        Queue<String> queue = new ArrayDeque<>(); // First In First Out
        queue.offer("Seoul");
        queue.offer("Busan");
        queue.offer("LA");
        System.out.println(queue); // [Seoul, Busan, LA]

        System.out.println(queue.poll()); // Seoul
        System.out.println(queue.poll()); // Busan
        System.out.println(queue); // [LA]

        // 2. Deque test1
        Deque<String> stack = new ArrayDeque<>();
        stack.offer("Seoul");
        stack.offer("Busan");
        stack.offer("LA");
        System.out.println(stack); // [Seoul, Busan, LA]

        System.out.println(stack.pollLast()); // LA
        System.out.println(stack.pollLast()); // Busan
        System.out.println(stack); // [Seoul]

        // 3. Deque test2
        Deque<String> deque = new ArrayDeque<>();
        deque.offer("Seoul"); // [Seoul]
        deque.offer("Busan"); // [Seoul, Busan]
        deque.offerFirst("LA"); // [LA, Seoul, Busan]
        System.out.println(deque);

        System.out.println(deque.poll()); // LA
        System.out.println(deque.pollLast()); // Busan
        System.out.println(deque);  // [Seoul]
    }
}