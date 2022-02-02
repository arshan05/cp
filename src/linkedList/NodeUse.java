package linkedList;

public class NodeUse {
    public static void main(String[] args) {
        Node block1 = new Node(5);
        Node block2 = new Node(10);
        Node block3 = new Node(15);


        block1.next = block2;
        block2.next = block3;

        Node head = block1;

        printLinkedList(head);
        Node newHead = reverseLinkedList.reverseLL(head);
        printLinkedList(newHead);
    }

    private static void printLinkedList(Node head){

        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
