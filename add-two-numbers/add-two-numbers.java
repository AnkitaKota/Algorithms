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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum;
        int carry = 0;
        ListNode curr = new ListNode(-1);
        ListNode  reverseNumbers = curr;
        while(l1!=null || l2!=null)
        {
            int x1 = l1 !=null? l1.val : 0;
            int x2 = l2!=null? l2.val :0;
             sum = (x1+x2+carry) % 10;
             carry = (x1 + x2+carry) /10;
             reverseNumbers.next = new ListNode(sum);
            reverseNumbers = reverseNumbers.next;
           if(l1!=null)
               l1= l1.next;
            if(l2!=null)
           l2 =  l2.next;
         
        }
        if(carry!=0)
        {
            reverseNumbers.next = new ListNode(carry);
        }
        
    return curr.next;    
        
        
        
        
    }
}