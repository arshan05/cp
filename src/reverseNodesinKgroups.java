import java.util.List;

public class reverseNodesinKgroups {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null)
            return null;

        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        ListNode tail = head;
        int count =0;
        ListNode countHead = head;
        while(countHead!=null){
            count++;
//            System.out.println(count);
            countHead = countHead.next;
        }
        System.out.println(head);
        if(count<k) {
            return head;
        }

        for(int i=0; i<k; i++){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        tail.next = reverseKGroup(curr,k);

        return prev;
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
        int[] keys = {1,2,3,4,5};
        int k = 3;

        ListNode head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new ListNode(keys[i], head);
        }

        head = reverseKGroup(head,k);
        printList(head);
    }
}
