package queue;


import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("First element");
        queue.offer("Second element");
        queue.offer("Third element");

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);


    }
}
