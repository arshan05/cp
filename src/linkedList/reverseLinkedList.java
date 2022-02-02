package linkedList;

public class reverseLinkedList {

    public static Node reverseLL(Node head){
        Node currentHead = head;
        Node restLLHead = null;
        Node recentLLHead = null;

        while (currentHead !=null) {
            restLLHead = currentHead.next;
            currentHead.next = recentLLHead;
            recentLLHead = currentHead;
            currentHead = restLLHead;
        }
        head = recentLLHead;

        return head;
    }
}
