package ca.monor.queue队列.Queue;
/**
 * 双端队列，因为从两头都可以操作，所以用链表来实现
 */

import ca.monor.list_链表.LinkedList;
import ca.monor.list_链表.List;

public class Deque<E> {
    private List<E> list = new LinkedList<>();

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void clear() {
        list.clear();
    }

    public void enQueueRear(E element) {  //队尾 Rear 入队, index == size
        list.add(element);
    }

    public E deQueueFront() {
        return list.remove(0);
    }

    public void enQueueFront(E element) {  //从 front 入队，即 index == 0
        list.add(0, element);
    }

    public E deQueueRear() {
        return list.remove(size() - 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size(); i++) {
            sb.append(i == 0 ? list.get(i) : (", " + list.get(i)));
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        Deque deque = new Deque();
        System.out.println(deque);
        deque.enQueueRear(12);
        System.out.println(deque);
        deque.enQueueRear(41);
        System.out.println(deque);
        deque.enQueueFront(57);
        System.out.println(deque);
        deque.enQueueFront(79);
        System.out.println(deque);
        System.out.println(deque.deQueueRear());
        System.out.println(deque);
        System.out.println(deque.deQueueFront());
        System.out.println(deque);
    }
}
