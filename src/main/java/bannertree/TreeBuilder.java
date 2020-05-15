package bannertree;


import treenode.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class TreeBuilder {
    /**
     * 遍历打印节点
     * 前序遍历（递归方式)
     *
     * @param treeNode
     */
    public void preOrderByRecursion(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.println("node is:" + treeNode.getValue());
            //递归
            preOrderByRecursion(treeNode.getLeftChild());
            //递归
            preOrderByRecursion(treeNode.getRightChild());
        }
    }

    /**
     * 中序遍历（递归方式）
     *
     * @param treeNode
     */
    public void inOrderByRecursion(TreeNode treeNode) {
        if (treeNode != null) {
            inOrderByRecursion(treeNode.getLeftChild());
            System.out.println("node is:" + treeNode.getValue());
            inOrderByRecursion(treeNode.getRightChild());
        }
    }

    /**
     * 后序遍历（递归方式）
     *
     * @param treeNode
     */
    public void postOrderByRecursion(TreeNode treeNode) {
        if (treeNode != null) {
            postOrderByRecursion(treeNode.getLeftChild());
            postOrderByRecursion(treeNode.getRightChild());
            System.out.println("node is:" + treeNode.getValue());
        }
    }


    /**
     * 求最大深度（递归）
     *
     * @param root
     * @return
     */
    public int maxDepthByRecursion(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepthByRecursion(root.getLeftChild());
        int right = maxDepthByRecursion(root.getRightChild());
        return Math.max(left, right) + 1;
    }

    /**
     * 前序遍历（非递归方式）
     * 1.先入栈根结点，输出根结点value值，再先后入栈其右结点、左结点；
     * 2.出栈左结点，输出其value值，再入栈该左结点的右结点、左结点；直到遍历完该左结点所在子树。
     * 3.再出栈右结点，输出其value值，再入栈该右结点的右结点、左结点；直到遍历完该右结点所在子树。
     *
     * @param root
     */
    public void preOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            TreeNode top = stack.pop();
            System.out.println("node is:" + top.getValue());
            if (top.getRightChild() != null) {
                stack.push(top.getRightChild());
            }
            if (top.getLeftChild() != null) {
                stack.push(top.getLeftChild());
            }
        }
    }

    /**
     * 求最大深度（非递归）
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 结点不断入队出队的过程，直到左右都无叶子结点
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            level++;
            int levelNum = queue.size();
            for (int i = 0; i < levelNum; i++) {
                TreeNode node = queue.poll();
                if (node.getLeftChild() != null) {
                    queue.offer(node.getLeftChild());
                }
                if (node.getRightChild() != null) {
                    queue.offer(node.getRightChild());
                }
            }
        }
        return level;
    }

}
