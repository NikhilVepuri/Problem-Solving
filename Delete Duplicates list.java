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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        ListNode prev=new ListNode(0);
        ListNode reshead=null;
        prev.next=head;
       
        if(temp==null||temp.next==null)
            return head;
        
        while(temp!=null)
        {
            if(temp.next!=null&&temp.val==temp.next.val)
            {
                temp.next=temp.next.next;
                
                while(temp.next!=null)
                {
                    if(temp.val==temp.next.val)
                        temp.next=temp.next.next;
                    else
                        break;
                }
               
              prev.next=temp.next;
              temp=prev.next;
               
            }
            else
            {
                 if(reshead==null)
                    reshead=prev.next;
                temp=temp.next;
                prev=prev.next;
            }
            
        }
        
        
        return reshead;
        }
    }
