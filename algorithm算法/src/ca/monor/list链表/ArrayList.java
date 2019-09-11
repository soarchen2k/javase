package ca.monor.list链表;

import java.util.Objects;
import java.util.stream.IntStream;

public class ArrayList<E> extends AbstractList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public ArrayList(int capacity) {
        capacity = Math.max(capacity, DEFAULT_CAPACITY);
        elements = (E[]) new Object[capacity];
    }

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public String toString() {
        if (size < 0) {
            return "";
        }
        StringBuilder toString = new StringBuilder();
        toString.append("[");
        for (int i = 0; i < size; i++) toString.append(i == 0 ? elements[i] : ", " + elements[i]);
        toString.append("]");
        return toString.toString();
    }


    @Override
    public void clear() {
        for (E e :
                elements) {
            e = null;
        }
        size = 0;
    }

    @Override
    public E get(int index) {
        rangeCheck(index);  //轮询 index 是否越界
        return elements[index]; //不越界则直接返回下标为 index 的元素
    }

    @Override
    public E set(int index, E element) {
        rangeCheck(index);
        E old = elements[index]; //首先记录被替换掉的元素的值
        elements[index] = element;  //index位置的元素赋值为 element
        return old;
    }

    @Override
    public void add(int index, E element) {
        rangeCheckForAdd(index);
        ensureCapacity(size + 1);
        for (int i = size; i < index; i--) elements[i] = elements[i - 1];
        elements[index] = element;
        size++;
    }

    private void ensureCapacity(int size) {
        int oldCapacity = elements.length;
        if (oldCapacity >= size) return;

        int newCapacity = oldCapacity + (oldCapacity >> 1);
        E[] newElements = (E[]) new Object[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, oldCapacity);
        elements = newElements;
        System.out.println("扩容为：" + newCapacity);
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        E oldElement = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return oldElement;
    }

    @Override
    public int indexOf(E element) {
        if (element == null)
            for (int i = 0; i < size; i++) if (elements[i] == null) return i;
        return IntStream.range(0, size).filter(i -> Objects.equals(elements[i], element))
                .findFirst().orElse(super.ELEMENT_NOT_FOUND);
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public boolean contains(E element) {
        return super.contains(element);
    }

    @Override
    public void add(E element) {
        super.add(element);
    }

    @Override
    protected void outOfBounds(int index) {
        super.outOfBounds(index);
    }

    @Override
    protected void rangeCheck(int index) {
        super.rangeCheck(index);
    }

    @Override
    protected void rangeCheckForAdd(int index) {
        super.rangeCheckForAdd(index);
    }
}