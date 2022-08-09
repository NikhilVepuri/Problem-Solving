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
    ListNode afterNode = null;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        int counter=1;
        if(left==1)
        {
            return reverse(head,right);
        }
        else
        {
            while(counter<left - 1) {
                
                temp=temp.next;
                counter++;
                right--;
            }
            right--;
            temp.next=reverse(temp.next,right);
            return head;
        }
            
        
}
    public  ListNode reverse(ListNode head, int k)
    {
       
        if(k==1)
        {
            afterNode=head.next;
            return head;
        }
        k--;
        ListNode lastNode=reverse(head.next,k);
        head.next.next=head;
        head.next=afterNode;
        
        return lastNode;
    }
    
}