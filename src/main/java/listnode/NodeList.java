package listnode;


/**
 * @author yichuan
 */
public class NodeList<T extends ListNode> {
    /**
     * 求长度
     *
     * @return
     */
    public int lenLinkList(ListNode headNode) {
        int length = 0;
        ListNode<T> currentNode = headNode;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNextNode();
        }
        return length;
    }

    /**
     * 打印结点信息
     */
    public void printListNodes(ListNode headNode) {
        ListNode<T> currentNode = headNode;
        while (currentNode != null) {
            System.out.println("data:" + currentNode.getData());
            currentNode = currentNode.getNextNode();
        }
    }

    /**
     * 插入结点
     *
     * @param newNode
     * @param position
     * @return
     */
    public ListNode insertElementToLinkList(ListNode<T> headNode, ListNode<T> newNode, final int position) {
        // 插入到头结点
        // 插入到尾部
        // 插入到中间任意一个位置
        int size = this.lenLinkList(headNode);
        if (position < 0 || position > size) {
            throw new IllegalArgumentException("index is error");
        }
        ListNode<T> currentNode = newNode;
        if (position == 0) {
            //插入头部
            headNode = currentNode;
            size++;
            System.out.println("" + headNode.toString());
            return headNode;
        }
        //insert head
        if (position == 1) {
            //新元素指向头结点
            currentNode.setNextNode(headNode);
            //head移动到最前面，指向新结点
            headNode.setNextNode(currentNode);
            //这句比较重要
            currentNode.setNextNode(null);
            size++;

        } else {
            //中间插入元素
            //1 移动结点到指定位置
            int count = 1;
            ListNode preNode = headNode;
            while (count <= position - 1) {
                preNode = preNode.getNextNode();
                count++;
            }
            currentNode = preNode.getNextNode();
            //2 修改新结点到指向
            newNode.setNextNode(currentNode);
            //3 后继结点指向添加到新结点
            preNode.setNextNode(newNode);
        }
        System.out.println("" + headNode.toString());
        return headNode;
    }

    /**
     * 删除元素
     *
     * @param headNode
     * @param position
     */
    public ListNode deleteElementInLinkList(ListNode<T> headNode, int position) {
        // 删除头结点
        // 删除尾部
        // 删除中间任意一个位置
        ListNode<T> listNode = null;
        if (position == 0) {

        }
        return listNode;
    }

}
