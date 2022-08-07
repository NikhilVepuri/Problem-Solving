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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode prev=head;
        ListNode next=head;
        ListNode temp=head;
        int count=0;
        if(head==null||head.next==null)
            return head;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
      
        if(k>=count)
        {
            k=k%count;
        }
        if(k==0)
            return head;
        for(int i=0;i<k;i++)
        {
                next=next.next;
        }
        while(next.next!=null)
        {
            prev=prev.next;
            next=next.next;
        }
     
        next.next=head;
        head=prev.next;
        
        prev.next=null;
        return head;
        
    }
}