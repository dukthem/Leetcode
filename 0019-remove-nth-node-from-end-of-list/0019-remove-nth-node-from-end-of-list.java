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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Handle single node list
        if (head.next == null) return null;
        
        ListNode ptr = head;
        ListNode temp = head;
        
        // Move ptr forward n times to create the gap
        int i = 1;
        while (i <= n) {
            ptr = ptr.next; 
            i++;
        }
        
        // If ptr becomes null, we need to remove the head
        if (ptr == null) return head.next;
        
        // Move both until ptr reaches the last node
        while (ptr.next != null) {
            ptr = ptr.next;
            temp = temp.next;
        } 
        
        // Skip the nth node from the end
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        
        return head;
        
        
        // ListNode curr = head;
        // ListNode curr1 = head;
        // ListNode front = head.next;
        // int size = 1;
        // if (curr.next == null){
        //     size = 1;
        //     head = null;
        //     return head;
        // }else{
        //     while(curr.next != null){
        //         curr = curr.next;
        //         size++;
        //         // System.out.println(curr.val);
        //         // System.out.println(size);
        //     }
        // }
        // int pos = size - n;
            
        //     for(int i = 0; i < size; i++){
        //         if(i + 1 == pos){
        //             curr1.next = front.next;
        //         }
                
        //         else{
        //             front = front.next;
        //             curr1 = curr1.next;
        //         }
        //         // System.out.println(i);
        //         // System.out.println(size);
        //     }
        // return head;
        
    }
}