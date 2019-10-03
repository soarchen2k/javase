package ca.monor.queue队列.circleQueue循环队列;

public class test {
    public static void main(String[] args) {
        CircleDeque deque = new CircleDeque();
        deque.enQueueFront(12);
        System.out.println(deque);
        deque.enQueueRear(13);
        System.out.println(deque);
    }
}
