package treenode;

import java.io.Serializable;

/**
 * @author yichuan
 */

/**
 * 树节点定义
 */
public class TreeNode<T> implements Serializable {
    private T value;
    /**
     * leftChild
     */
    private TreeNode<T> leftChild;
    /**
     * rightChild
     */
    private TreeNode<T> rightChild;

    public TreeNode(T value) {
        this.value = value;

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }
}
