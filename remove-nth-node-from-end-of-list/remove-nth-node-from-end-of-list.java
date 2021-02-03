/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      
        ListNode dummy = new ListNode(0);
        
        ListNode ptr1 = dummy;
        
        ListNode ptr2 = dummy;
        
       dummy.next = head;
        
      for(int i=1;i<=n+1;i++)
      {
          ptr1 = ptr1.next;
      }
        
      while(ptr1!=null)
      {
          ptr1 = ptr1.next;
          ptr2 = ptr2.next;
      }
      
        ptr2.next = ptr2.next.next;
        
     return dummy.next;   
        
    }
}