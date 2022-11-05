package methodpractice;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeTest {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("hello");
        queue.remove();
        queue.peek();
        queue.offer("hello");
        queue.poll();

    }
}
