package ca.monor.queue队列.circleQueue循环队列;

import java.util.Objects;
import java.util.stream.IntStream;

public class CircleQueue<E> {
    private int front; // 记录队头元素的下标
    private int size;
    private E[] elements;
    private static final int DEFAULT_CAPACITY = 10;

    public CircleQueue() {
        elements = (E[]) new Objects[DEFAULT_CAPACITY];  //新建一个对象数组，初始长度为 10
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
        front = 0;
    }

    public void enQueue(E element) {
        ensureCapacity(size + 1);
        elements[index(size)] = element;  // 调用 index() 方法来确定向哪个位置进行插入
        size++;
    }

    private int index(int index) {
        /**
         * 当capacity足够插入，即 size+1 < elements.length 的时候，即将要插入的位置，
         * return (front+index)%elements.length;
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
        E[] newElements = (E[]) new Objects[capacity];
        IntStream.range(0, elements.length).forEachOrdered(j -> newElements[j] = elements[index(j)]);
        elements = newElements;
        front = 0;  //需要重置 front
    }
}
