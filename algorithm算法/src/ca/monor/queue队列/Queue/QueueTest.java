package ca.monor.queue队列.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push("test");
        queue.push(254);
        queue.push("past");
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.pop());
        System.out.println(queue);

        Deque deque = new LinkedList();
        deque.addFirst(57);
        deque.addLast(75);
        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque.isEmpty());
    }
}
