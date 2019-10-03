package ca.monor.queue队列.Queue;
/**
 * 用栈实现的队列
 */

import ca.monor.stack栈.Stack;

public class Queue<E> {
    private Stack<E> entry;
    private Stack<E> out;

    /** Initialize your data structure here. */
    public Queue() {
        this.entry = new Stack();
        this.out = new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(E x) {
        entry.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public E pop() {
        if (out.isEmpty()) {
            if (entry.isEmpty()) {
                return null;
            } else {
                swap4Pop();
                return entry.pop();
            }
        } else return out.pop();
    }

    private void swap4Pop() {
        int size = entry.size();
        for (int i = 0; i < size - 1; i++) {
            out.push(entry.pop());
        }
    }

    /** Get the front element. */
    public E peek() {
        if (out.isEmpty()) {
            if (entry.isEmpty()) {
                return null;
            } else {
                swap4Peek();
            }
        }
        return out.peek();
    }

    private void swap4Peek() {
        int size = entry.size();
        for (int i = 0; i < size; i++) {
            out.push(entry.pop());
        }
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return entry.isEmpty() && out.isEmpty();
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "entry=" + entry +
                ", out=" + out +
                '}';
    }
}
