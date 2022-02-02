public class mergeKsortedList {
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length==0){
            return null;
        }
        int last = lists.length-1;

        while(last!=0){
            int i =0, j=last;
            while(i<j){
                lists[i] = sortedMerge(lists[i],lists[j]);
                i++;
                j--;

                if (i>=j){
                    last=j;
                }
            }
        }
        return lists[0];
    }

    private static ListNode sortedMerge(ListNode list, ListNode list1) {
        if (list == null){
            return list1;
        }
        else if(list1==null){
            return list;
        }
        ListNode res;

        if(list.val <= list1.val){
            res = list;
            res.next = sortedMerge(list.next,list1);
        }
        else{
            res = list1;
            res.next = sortedMerge(list,list1.next);
        }
        return res;
    }

    public static void main(String[] s)
    {
        int k = 3;    // total number of linked lists

        // an array to store the head nodes of the linked lists
        ListNode[] lists = new ListNode[k];

        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(5);
        lists[0].next.next = new ListNode(7);

        lists[1] = new ListNode(2);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(6);
        lists[1].next.next.next = new ListNode(9);

        lists[2] = new ListNode(4);
        lists[2].next = new ListNode(8);
        lists[2].next.next = new ListNode(10);

        // Merge all lists into one
        ListNode head = mergeKLists(lists);

        printList(head);
    }
    public static void printList(ListNode node)
    {
        while (node != null)
        {
            System.out.print(node.val + " —> ");
            node = node.next;
        }
        System.out.print("null");
    }
}

