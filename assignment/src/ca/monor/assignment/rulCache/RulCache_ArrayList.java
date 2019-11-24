package ca.monor.assignment.rulCache;

import java.util.Arrays;

public class RulCache_ArrayList<E> {
    private static final int MAX_SIZE = 7;
    private int index;
    private E[] elements;

    public RulCache_ArrayList() {
        elements = (E[]) new Object[MAX_SIZE];
    }

    public void add(E element) {
        add(index, element);
    }

    private void add(int index, E element) {
        this.index = index >= MAX_SIZE ? (index - MAX_SIZE) : index;
        elements[this.index] = element;
        this.index++;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
