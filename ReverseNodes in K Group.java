/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var reverseKGroup = function(head, k) {
    
   
     if(head == null) return head;
    
   
    if(k <= 1) return head;
    
    let originalVal = k;
    
    let curr = head;
    
    while(k > 1 ){
        
        if(curr == null) return head;
        curr = curr.next;
        k--;
    }
    
    if(curr == null) return head;
    
    let futureResult = reverseKGroup(curr.next, originalVal);
   
    curr.next = null;
    let reverseOutput = reverse(head);
  
    head.next = futureResult;
    
    return reverseOutput;
     
    function reverse(list){
        if(list == null || list.next == null){
            return list;
        }
        
        let lastNode = reverse(list.next);
        list.next.next = list
        return lastNode;
    }
    
   
};