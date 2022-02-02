import javax.swing.plaf.IconUIResource;

public class removeDuplicates {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode res = new ListNode();
        if (head == null){
            return null;
        }

        while (head != null && head.next != null){
            if(head.val != head.next.val){
                res = head;
                res = res.next;
                head = head.next;
            }else{
                head = head.next;
            }
        }
        return res;
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
        int[] keys = {1, 2, 2, 2, 3, 4, 4, 5};

        ListNode head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new ListNode(keys[i], head);
        }

        head = deleteDuplicates(head);
        printList(head);
    }
}
