package NickWhite;

import linkedList.Node;

import java.util.LinkedHashMap;
import java.util.List;

public class palndromeLinkedList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode slow =head;
        ListNode fast = head;

        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reversed(slow);
        fast = head;

        while(slow != null){
            if(slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;

    }

    private static ListNode reversed(ListNode head) {
        if(head==null || head.next == null)
            return head;

        ListNode second = head.next;

        head.next = null;

        ListNode rest = reversed(second);
        second.next = head;

        return rest;
    }

    public static void main(String[] args) {
        ListNode block1 = new ListNode(1);
        ListNode block2 = new ListNode(2);
        ListNode block3 = new ListNode(2);
        ListNode block4 = new ListNode(1);

        block1.next = block2;
        block2.next = block3;
        block3.next = block4;
        block4.next =null;

        System.out.println(isPalindrome(block1));



    }

}
