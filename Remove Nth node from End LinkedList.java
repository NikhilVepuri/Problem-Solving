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

//Here let's say total size of Linkedlist is 's'. Take two pointers curr, prev. Move curr n times and then start moving "prev" parallel with "curr" until curr.next=null. According to mathematical formula when curr.next=null "prev" will be pointing to the node to be removed i.e., s-n

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
         ListNode prev=head;
        
        for(int i=0;i<n;i++)
        {
            curr=curr.next;
        }
        if(curr == null)
        {
            return head.next;
        }
        while(curr.next != null)
        {
            prev=prev.next;
            curr=curr.next;
          //  System.out.println("prev"+prev.val);
        }
       prev.next=prev.next.next;
        return head;
        
        
        //    ListNode curr=head;
        // int count=0;
        // ListNode prev=null;
        // while(curr!=null)
        // {
        //     curr=curr.next;
        //     count++;
        // }
        // curr=head;
        // int loop=count-n;
        // if(loop==0)
        //     return head.next;
        // while(loop>0)
        // {
        //     prev=curr;
        //     curr=curr.next;
        //     loop--;
        // }
        // // System.out.println("curr"+curr.val);
        // // System.out.println("prev"+prev.val);
        // prev.next=curr.next;
        // return head;
    }
}