package listnode;

/**
 * @param <T>
 */
public class ListNode<T> {
    private T data;
    private ListNode nextNode;

    public ListNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "data=" + data +
                ", nextNode=" + nextNode +
                '}';
    }
}
