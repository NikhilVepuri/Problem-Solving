//Here for ex 243 + 564 =708, adding 2+5 gives 7 and 4+6 gives 10 where 0 and 1 is carry which gives 7 0 and 3+4+1(1 carry) gives result 708.
//following above taking a pointer reshead with one node being 0 and then creating new node each time we add. using var carry to hold the carry if generated.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.List;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode reshead=new ListNode(0);
        ListNode curr=reshead;
        System.out.println("reshead "+reshead.val+"curr"+curr.val);
        int carry=0,sum;
        while(l1!=null||l2!=null)
        {
             int x = (l1!= null) ? l1.val : 0;
             int y = (l2!= null) ? l2.val : 0;
            sum=x+y+carry;
            carry=0;
            if(sum>9)
            {
                carry=sum/10;
            }
            curr.next=new ListNode(sum%10);
              System.out.println("reshead "+reshead.val);
            curr=curr.next; 
             if (l1 != null)l1=l1.next;
             if (l2 != null) l2=l2.next;
        }
        if(carry>0)
        {
            curr.next=new ListNode(carry);
        }
        return reshead.next;
    }
}