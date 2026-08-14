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
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        long cnt = 0;
        ListNode curr = head;
        if (curr.next == null){
            if(curr.val == 1){
                return 1;
            }
            else{
                return 0;
            }
        } else{
            ListNode curr2 = head;
            int siz = 0;
            while(curr2 != null){
                siz++;
                curr2 = curr2.next;
            }
            System.out.println(siz);
            while(curr != null){
                ans += (curr.val * Math.pow(2, siz - 1));
                siz--;
                curr = curr.next;
                // cnt = (cnt * 10) + curr.val;
                // System.out.println(cnt);
                // curr = curr.next;
                // if(curr.next == null){
                //     cnt = (cnt * 10) + curr.val;
            // }
            }
            // System.out.println(cnt);
            // long digit = 0;
            // long p = 0;
            // while(cnt != 0){
            //     digit = cnt % 10;
            //     ans += (digit * Math.pow(2, p));
            //     p += 1;
            //     cnt = cnt / 10;
            // }
            // int rans = 0;
            // int rans = 0 + (int) ans;
            return ans;
        }
    }
}