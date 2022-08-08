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
    public ListNode partition(ListNode head, int x) {
        ListNode largerNode=null;
        ListNode smallerNode=null;
        ListNode temp=head;
        ListNode large=new ListNode(0);
         ListNode small=new ListNode(0);
           if(head==null||head.next==null)
           {
               return head;
           }
        while(temp!=null)
        {
            if(temp.val>=x)
            {
                if(largerNode==null)
                {
                      largerNode=temp;
                      large.next=largerNode;
                   
                }
                else
                {
                  largerNode.next=temp;
                  largerNode=largerNode.next;
                 
                }
                
               
            }
            else
            {
                if(smallerNode==null)
                {
                     smallerNode=temp;
                     small.next=smallerNode;
                     
                }
                else
                {
                   smallerNode.next=temp;
                   smallerNode=smallerNode.next;
                 
                }
                
            }
            temp=temp.next;
        }
      // System.out.println("larger end"+largerNode.next.val);
        
        if(largerNode == null || smallerNode == null) return head;
         smallerNode.next=large.next;
            largerNode.next=null;
        
            return small.next;
        
    
        
    }
}