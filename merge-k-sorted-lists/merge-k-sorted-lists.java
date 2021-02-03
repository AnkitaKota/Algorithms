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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode(-1);
       
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) ->Integer.compare(a,b));  
        
        for(ListNode List: lists)
        {
            ListNode head = List;
            while(head!=null)
            {
                pq.add(head.val);
                head = head.next;  
            }
            
        }
        
  
           ListNode output;
        output = result;
        while(pq.size()>0)
        {
          result.next = new ListNode(pq.poll());
         result = result.next;
        }
        
       return output.next; 
        
        
    }
}




