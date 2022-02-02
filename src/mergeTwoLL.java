public class mergeTwoLL {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        else if (list2 == null) {
            return list1;
        }

        ListNode result;

        if (list1.val <= list2.val)
        {
            result = list1;
            result.next = mergeTwoLists(list1.next, list2);
        }
        else {
            result = list2;
            result.next = mergeTwoLists(list1, list2.next);
        }

        return result;
    }


    public static void main(String[] args) {
        int[] key1 = {2};
        int[] key2 = {1};

        ListNode head1 = null;
        ListNode head2 = null;
        for (int i = key1.length - 1; i >= 0; i--) {
            head1 = new ListNode(key1[i], head1);
        }
        for (int i = key2.length - 1; i >= 0; i--) {
            head2 = new ListNode(key2[i], head2);
        }

        ListNode head = new ListNode();
        head = mergeTwoLists(head1,head2);
        printList(head);
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
}
