import listnode.ListNode;
import listnode.NodeList;
import org.junit.Test;

public class NodeListTest {

    NodeList nodeList = new NodeList<>();

    @Test
    public void testNode() {
        //
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        //
        ListNode node;
        ListNode headNode = nodeList.insertElementToLinkList(null, node1, 0);
        int len = nodeList.lenLinkList(headNode);
        System.out.println("len:" + len);
        ////
        node = nodeList.insertElementToLinkList(headNode, node2, 1);

        len = nodeList.lenLinkList(node);
        System.out.println("len:" + len);

        node = nodeList.insertElementToLinkList(node, node3, 2);
        len = nodeList.lenLinkList(node);
        System.out.println("len:" + len);
        nodeList.printListNodes();
    }
}
