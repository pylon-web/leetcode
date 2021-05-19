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
    public ListNode swapPairs(ListNode head) {
        
        ListNode l1=null;
        ListNode l2=null;
        
        while(head!=null){
            
            if(head.next!=null){
                int a=head.val;
                head=head.next;
                int b=head.val;
                head=head.next;
                ListNode node1=new ListNode(b);
                ListNode node2=new ListNode(a);
                if(l1==null){
                    l1=node1;
                    l2=node1;      
                    l2.next=node2;
                    l2=l2.next;
                   
                }else{
                   
                    l2.next=node1;
                    l2=l2.next;
                    l2.next=node2;
                    l2=l2.next;
                    
                }
            }else{
                int k=head.val;
                head=head.next;
                ListNode node3=new ListNode(k);
                if(l1==null){
                    l1=node3;
                    l2=node3;
                }else{
                    l2.next=node3;
                    l2=l2.next;
                    l2=node3;
                }
            }
        }
        return l1;
    }
}
