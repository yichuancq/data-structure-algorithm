package treenode;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author yichuan
 */
@Getter
@Setter
@ToString
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
}
