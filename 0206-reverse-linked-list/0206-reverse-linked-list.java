/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }else {
            ListNode prev = null;
            ListNode h = head;
            ListNode n = h.next;
            while(h != null){
                h.next = prev;
                prev = h;
                h = n;
                if (h == null){
                    break;
                }
                n = h.next;
            }
            return prev;
        }
        

    }
}