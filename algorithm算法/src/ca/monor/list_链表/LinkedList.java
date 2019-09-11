package ca.monor.list_链表;

public class LinkedList<E> extends AbstractList<E> {
    private Node<E> first;
    private Node<E> last;

    private static class Node<E> {  //建立一个节点
        E element;
        Node<E> prev;
        Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();

            if (prev != null) {
                stringBuilder.append(prev.element);
            } else {
                stringBuilder.append("null");
            }

            stringBuilder.append("_").append(element).append("_");

            if (next != null) {
                stringBuilder.append(next.element);
            } else {
                stringBuilder.append("null");
            }
            return stringBuilder.toString();
        }
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
        last = null;
    }

    @Override
    public E get(int index) {
        return node(index).element;  //调用 node(int) 方法，返回节点的 element 元素值
    }

    private Node<E> node(int index) {
        rangeCheck(index);
//        Node<E> node = first;
//        for (int i = 0; i < size; i++) {
//            node = node.next;
//        }
//        return node;

        if (index < (size >> 1)) { // index 在左半部分
            Node<E> node = first;  // 创建一个 Node 节点，指向首节点
            for (int i = 0; i < index; i++) {
                node = node.next; //遍历左半部分，找出 index 位置上的 node
            }
            return node; //返回节点
        } else {  //index 在右半部分
            Node<E> node = last; //创建一个节点，指向尾节点
            for (int i = size - 1; i > index; i--) {
                node = node.prev;  //向前遍历链表，找出 index 位置上的 node
            }
            return node;  //返回节点
        }
    }

    @Override
    public E set(int index, E element) {
        rangeCheck(index);
        Node<E> node = node(index); //创建一个节点，使其指向位于 index 位置上的节点
        E old = node.element; //创建一个记录元素，并把节点的元素赋值给该记录元素
        node.element = element;  //为节点的 element 元素赋值为传入的 element
        return old;  //返回记录的老的节点元素值
    }

    @Override
    public void add(int index, E element) {
        rangeCheckForAdd(index);

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }
}
