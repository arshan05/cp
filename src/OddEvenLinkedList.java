public class OddEvenLinkedList {
    public static ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode();
        ListNode even = new ListNode();

        rearrange(head,odd,even,even);
        return odd.next;
    }

    private static ListNode rearrange(ListNode head, ListNode odd, ListNode even, ListNode even1) {
        if (head == null){
            even.next=null;
            odd.next = even1.next;
            return head;
        }

        if ((head.val & 1) != 0){
            odd.next = head;
            rearrange(head.next,head,even,even1);
        }
        else{
            even.next = head;
            rearrange(head.next, odd,head,even1);
        }
        return head;
    }

    public static void printList(ListNode head)
    {
        ListNode ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.val + " —> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args)
    {
        // input keys
        int[] keys = {2,1,3,5,6,4,7};

        ListNode head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new ListNode(keys[i], head);
        }

        head = oddEvenList(head);
        printList(head);
    }


}
