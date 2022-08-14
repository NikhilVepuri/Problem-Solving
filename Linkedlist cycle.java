/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
  if(head == null || head.next == null) return false;
        
        ListNode slowerNode = head;
        
        ListNode fasterNode =  slowerNode.next.next;
        
        while(slowerNode != null && fasterNode != null){
            
            if(slowerNode == fasterNode) return true;
            
            slowerNode = slowerNode.next;
            
            if(fasterNode.next == null) return false;
            
            fasterNode = fasterNode.next.next;
        }
        
        return false;
    }

}