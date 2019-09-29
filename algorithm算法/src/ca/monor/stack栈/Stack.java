package ca.monor.stack栈;

import ca.monor.list_链表.ArrayList;
import ca.monor.list_链表.List;

import java.util.Objects;

public class Stack<E> {
    private List<E> stack;

    public Stack(ArrayList<E> stack) {
        this.stack = stack;
    }

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public int size() {
        return this.stack.size();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void push(E element) {
        this.stack.add(element);
    }

    public E pop() {
        return this.stack.remove(stack.size() - 1);
    }

    public E peek() {
        return this.stack.get(stack.size() - 1);
    }

    public void clear() {
        this.stack.clear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stack<?> stack1 = (Stack<?>) o;
        return Objects.equals(stack, stack1.stack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stack);
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + stack +
                '}';
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
