# data-structure-algorithm
Java数据结构与算法


- 树节点定义
```java
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
```
- 测试类
```java
    @Test
    public void testTree() {

        TreeNode A = new TreeNode("A");
        TreeNode B = new TreeNode("B");
        TreeNode C = new TreeNode("C");
        TreeNode D = new TreeNode("D");
        TreeNode E = new TreeNode("E");
        TreeNode F = new TreeNode("F");
        TreeNode G = new TreeNode("G");
        TreeNode H = new TreeNode("H");
        TreeNode I = new TreeNode("I");
        TreeNode J = new TreeNode("J");
        TreeNode K = new TreeNode("K");

        A.setLeftChild(B);
        A.setRightChild(C);
        B.setLeftChild(D);
        B.setRightChild(E);
        C.setLeftChild(F);
        C.setRightChild(G);
        D.setLeftChild(H);
        D.setRightChild(I);
        E.setRightChild(J);
        F.setRightChild(K);
        TreeBuilder treeBuilder = new TreeBuilder();

        System.out.println("先序遍历");
        treeBuilder.preOrderByRecursion(A);

        System.out.println("中序遍历");
        treeBuilder.inOrderByRecursion(A);

        System.out.println("后序遍历");
        treeBuilder.postOrderByRecursion(A);
        // 前序遍历(非递归)
        System.out.println("前序遍历：");
        treeBuilder.preOrder(A);
        //
        System.out.println();
        System.out.println("求最大深度:" + treeBuilder.maxDepthByRecursion(A));
        //
        System.out.println("求最大深度:" + treeBuilder.maxDepth(A));

 }
```
