import NickWhite.palndromeLinkedList;

public class intersectionOfTwoLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0;
        int len2 = 0;

        ListNode p1 = headA;
        ListNode p2 = headB;

        if (p1 == null || p2 == null)
            return null;

        while(p1 != null){
            len1++;
            p1 = p1.next;
        }
        while(p2 !=null){
            len2++;
            p2 = p2.next;
        }

        int dif = 0;
        p1=headA;
        p2=headB;

        if(len1 > len2){
            dif = len1-len2;
            int i=0;
            while(i<dif){
                p1 = p1.next;
                i++;
            }
        }else{
            dif = len2-len1;
            int i=0;
            while(i<dif){
                p2 = p2.next;
                i++;
            }
        }

        while(p1 != null && p2 != null){
            if(p1.val == p2.val){
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return null;
    }
}
