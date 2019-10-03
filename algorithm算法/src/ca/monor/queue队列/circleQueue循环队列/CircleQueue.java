package ca.monor.queue队列.circleQueue循环队列;

import java.util.stream.IntStream;

public class CircleQueue<E> {
    private int front; // 记录队头元素的下标
    private int size;
    private E[] elements;
    private static final int DEFAULT_CAPACITY = 10;

    public CircleQueue() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];  //新建一个对象数组，初始长度为 10
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;  //把 elements 数组中的每一个元素都清空
        }
        size = 0;
        front = 0;  //并且恢复 front 头指针的位置
    }

    public void enQueue(E element) {
        ensureCapacity(size + 1);
        elements[index(size)] = element;  // 调用 index() 方法来确定向 elements 的哪个位置进行插入
        size++;
    }

    public E deQueue() {  // deQueue 操作，尾进头出，所以取出头元素，把原头元素置空，
        // 并把 front 指针前移一个位置，size 减小 1
        E oldFront = elements[front];
        elements[front] = null;
        front = index(1);  // 前移方法为将 front 修改为 index(1) 的位置，因为是循环队列
        size--;
        return oldFront;
    }

    public E front() {  //返回头节点的值
        return elements[front];
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("capcacity=").append(elements.length)
                .append(" size=").append(size)
                .append(" front=").append(front)
                .append(", [");
        for (int i = 0; i < elements.length; i++) {
            if (i != 0) {
                string.append(", ");
            }

            string.append(elements[i]);
        }
        string.append("]");
        return string.toString();
    }

    private int index(int index) {
        /**
         * index 方法至关重要，是以 index 为下标的元素，在 elements 数组中的实际位置，因为 front 是变化的，所以
         * index 在数组中的实际位置也跟随者 front 变化
         * 在 enQueue 操作中，当 capacity 足够插入，即 size + 1 < elements.length 的时候，即将要插入的位置
         * index 的位置为 front 与 index 的和，模数组的长度
         * return (front+index)%elements.length;
         * 因爲 * / % 运算非常消耗计算机资源，应该尽量避免，所以尽量修改成没有以上运算的形式
         */

        index += front;
        return index - (index >= elements.length ? elements.length : 0);//front+size<2size
    }

    private void ensureCapacity(int i) {
        int capacity = elements.length;
        if (capacity >= i) {
            return;
        } else {
            capacity += capacity >> 1;
        }
        E[] newElements = (E[]) new Object[capacity];

        // newElements[j] = elements[index(j)] 至关重要，
        // 新数组的元素需要与原数组的「实际」 index 位置所在元素相对应
        IntStream.range(0, elements.length).forEachOrdered(j -> newElements[j] = elements[index(j)]);
        elements = newElements;
        front = 0;  //需要重置 front
    }

    public static void main(String[] args) {
        CircleQueue<Integer> circleQueue = new CircleQueue<>();
        circleQueue.enQueue(1);
        circleQueue.enQueue(2);
        circleQueue.enQueue(3);
        circleQueue.enQueue(4);
        System.out.println(circleQueue);
        circleQueue.deQueue();
        System.out.println(circleQueue);
        circleQueue.enQueue(5);
        circleQueue.enQueue(6);
        circleQueue.enQueue(7);
        circleQueue.enQueue(8);
        circleQueue.enQueue(9);
        System.out.println(circleQueue);
        circleQueue.enQueue(10);
        System.out.println(circleQueue);
        circleQueue.deQueue();
        circleQueue.deQueue();
        System.out.println(circleQueue);
        circleQueue.enQueue(11);
        System.out.println(circleQueue);
        System.out.println(circleQueue.deQueue());
        System.out.println(circleQueue);
        circleQueue.enQueue(12);
        circleQueue.enQueue(13);
        circleQueue.enQueue(14);
        System.out.println(circleQueue);
        circleQueue.enQueue(15);
        System.out.println(circleQueue);
    }
}
