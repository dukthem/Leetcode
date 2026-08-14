// TC: O(n)
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
    public ListNode middleNode(ListNode head) {
        int cnt = 0;
        ListNode curr = head;
        int siz = 0;
        while(curr != null){
            siz++; 
            curr = curr.next;
        }
        int mid = 0;
        if(siz % 2 != 0){
            mid = (siz+1) / 2;
        } else{
            mid = (siz/2) + 1;
        }
        cnt = 1;
        ListNode curr1 = head;
        while (cnt != mid){
            head = head.next;
            cnt++;
        }

        return head;
    }
}