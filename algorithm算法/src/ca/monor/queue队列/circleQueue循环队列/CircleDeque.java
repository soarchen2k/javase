package ca.monor.queue队列.circleQueue循环队列;

public class CircleDeque<E> {
    private int size;
    private int front;
    private E[] elements;
    private static final int DEFAULT_CAPACITY = 10;

    public CircleDeque() {
        this.elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public int front() {
        return front;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        front = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enQueueRear(E element) {
        ensureCapacity(size + 1);
        elements[index(size)] = element;
        size++;
    }

    public void enQueueFront(E element) {
        ensureCapacity(size + 1);
        front = index(-1);  //把整个队列看作是一个整体，队头为0位置，在队头前面插入元素，则是在队头的 -1 位置插入
        elements[front] = element;
        size++;
    }

    public E deQueueFront() {
        E e = elements[index(0)];
        elements[index(0)] = null;
        front = index(1);
        size--;
        return e;
    }

    public E deQueueRear() {
        E e = elements[index(size - 1)];
        elements[index(size - 1)] = null;
        size--;
        return e;
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

    private void ensureCapacity(int index) {
        int capacity = elements.length;
        if (capacity >= index) {
            return;
        } else {
            capacity += capacity >> 1;
        }
        E[] newElements = (E[]) new Object[capacity];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[index(i)];
        }
        elements = newElements;
    }

    private int index(int index) {
        index += front;
        if (index < 0) {
            return index + elements.length;  //当 index < 0 时，即头插时使用
        } else {
            return index - (index >= elements.length ? elements.length : 0);
        }
    }
}
