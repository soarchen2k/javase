package ca.monor.list_链表;

public class LinkedList<E> extends AbstractList<E> {
    private Node<E> first; //null 头节点为空
    private Node<E> last; //null 尾节点为空

    private static class Node<E> {
        /**
         * 建立一个节点，创建内部私有类。一个节点由
         * 节点元素 element，上一个节点，和下一个节点组成
         */

        Node<E> prev;
        E element;
        Node<E> next;

        public Node(Node<E> prev, E element, Node<E> next) {  //通过 3 个变量构成一个元素
            this.prev = prev;
            this.element = element;
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
        if (index == size) { //向链表的最后添加元素

            Node<E> oldLast = last;
            // 通过 oldLast 节点来记录之前的 last 节点

            last = new Node<>(oldLast, element, null);
            //为新的 last 节点赋值，使其值为 element，prev 指向 oleLast，next 指向 null
            if (oldLast == null) {  //表示这是该链表添加的第一个 Node 节点
                first = last; //首节点
            } else {
                oldLast.next = last;
            }
        } else {
            Node<E> next = node(index);  // index 所在当前位置，就是即将添加的节点的 next 位置，后移
            Node<E> prev = next.prev;  // index 所在位置的前一个节点，就是要添加的节点的 prev 位置
            Node<E> node = new Node<>(prev, element, next); // 创建新节点，并使新节点与前后节点相连
            next.prev = node;  //下一个节点的前节点，就是当前节点

            if (prev == null) {  // index == 0, 即节点的前节点为空，指向头
                first = node; //使首节点指向 node
            } else {
                prev.next = node; //使前一个节点的 next 指向插入的 node
            }
        }
        size++;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);

        // 定义出3个节点，分别是需要移出的节点，前一个节点，和后一个节点
        Node<E> node = node(index);
        Node<E> prev = node.prev;
        Node<E> next = node.next;

        if (prev == null) { //如果 index == 0，即移除第一个节点
            first = next; //首节点指向第二个节点
        } else {
            prev = next; //前一个节点指向下一个节点，即断开前后节点与被删除节点的联系
        }
        size--;

        return node.element;
    }

    @Override
    public int indexOf(E element) {
        if (element == null) { //如果节点元素为空
            Node<E> node = first; //定义一个节点指向首节点
            for (int i = 0; i < size; i++) {
                if (node.element == null) return i; //如果该节点数据为空，则返回该节点位置 i (链表无下标)
                node = node.next;
            }
        } else {
            Node<E> node = first; //定义一个节点指向首节点
            for (int i = 0; i < size; i++) {
                if (node.element.equals(element)) return i;
                node = node.next;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("size=").append(size).append(", [");
        Node<E> node = first;
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                string.append(", ");
            }

            string.append(node);

            node = node.next;
        }
        string.append("]");
        return string.toString();
    }
}
