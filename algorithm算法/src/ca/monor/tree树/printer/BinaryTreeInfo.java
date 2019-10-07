package ca.monor.tree树.printer;

public interface BinaryTreeInfo {
    /**
     * 定义root node
     * @return
     */
    Object root();

    /**
     * how to get the left child of the node
     * @param node
     * @return
     */
    Object left(Object node);

    /**
     * how to get the right child of the node
     * @param node
     * @return
     */
    Object right(Object node);

    /**
     * how to print the node
     * @param node
     * @return
     */
    Object string(Object node);
}
