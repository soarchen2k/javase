package ca.monor.assignment.rulCache;

import java.util.LinkedList;
import java.util.Queue;

public class RulCache_Queue<E> {
    private static final int MAX_CAPACITY = 7;
    private Queue<E> cache;

    public RulCache_Queue() {
        this.cache = new LinkedList<>();
    }

    public void add(E element) {
        if (cache.size() == MAX_CAPACITY) {
            reset(element);
        } else {
            cache.offer(element);
        }
    }

    private void reset(E element) {
        cache.poll();
        cache.offer(element);
    }
}
