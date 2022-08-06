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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=new ListNode(0);
        ListNode res=temp;
        while(list1!=null&&list2!=null)
        {
            if(list1.val<=list2.val)
            {
                temp.next=list1;
                temp=temp.next;
                list1=list1.next;
            }
            else
            {
                temp.next=list2;
                temp=temp.next;
                list2=list2.next;
            }
        }
        if(list1!=null)
            temp.next=list1;
        else
            temp.next=list2;
        
        return res.next;
        
        
        
//         ListNode reshead=new ListNode(0);
//         //ListNode res=reshead;
//         reshead.next=list1;
      
//         reshead=reshead.next;
      
//         reshead.next=list2;
        
        
//      System.out.println("reshead "+reshead+" reshead.next "+reshead.next);
        
//         list1 = list1.next;
//         list2 = list2.next;
//         while(list1 !=null || list2 != null)
//         {
             
//             reshead=reshead.next;
            
// //             System.out.println(" reshead next val "+reshead.next+" list1 "+list1.next+" list2 "+list2);
            
            
           
            
//             if(list1 == null)
//             {
//                 reshead.next=list2.next;
                
//                 return ;
//             }
//             else if(list2 == null)
//             {
//                 reshead.next=list1.next;
//                 list1=list1.next;
//                 continue;
//             }
            
//             if(list1.val<=list2.val)
//             {
//                 reshead.next=list1;
//                 list1=list1.next;
//             }
//             else if(list2.val<list2.val)
//             {
//                 reshead.next=list2;
//                 list2=list2.next;
//             }
           
//         }
//         return reshead.next;
        
        
    }
}