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
        return headNode;
    }

    /**
     * @param headNode
     * @param number
     * @return
     */
    public ListNode findElement(ListNode headNode, int number) {
        ListNode currentNode = headNode;
        while (currentNode != null) {
            if (currentNode.getData().equals(number)) {
                System.out.println("data:" + currentNode.getData());
                return currentNode;
            }
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }

    /**
     * 删除元素
     *
     * @param headNode
     * @param position
     */
    public ListNode deleteElementInLinkList(ListNode<T> headNode, final int position) {
        // 删除头结点
        // 删除尾部
        // 删除中间任意一个位置
        int size = this.lenLinkList(headNode);
        if (position < 0 || position > size) {
            throw new IllegalArgumentException("index is error");
        }
        //表头结点
        if (position == 0) {
            //
            ListNode currentNode = headNode.getNextNode();
            headNode = null;
            return currentNode;
        } else {
            //删除中间结点
            int count = 1;
            ListNode preNode = headNode;
            // 移动位置
            while (count < position) {
                preNode = preNode.getNextNode();
                count++;
            }
            //当前结点指向前驱结点到下一个结点
            ListNode currentNode = preNode.getNextNode();
            //前驱结点指向当前结点
            preNode.setNextNode(currentNode.getNextNode());
            currentNode = null;
        }
        return headNode;
    }

}
