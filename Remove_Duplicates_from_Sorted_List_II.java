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
         ListNode l1=head;
        ListNode l2=null,l3=null;
        
        int flag=0;
        while (l1!=null && l1.next!=null){
           if(l1.next.val==l1.val){
               l1.next=l1.next.next;
               flag=1;
           }else {
               if(flag==0){
               ListNode node=new ListNode(l1.val);
               if(l2==null){
                   l2=node;
                   l3=node;
               }else{
                   l3.next=node;
                   l3=node;
               }
               l1=l1.next;}
               else{flag=0;l1=l1.next;}
           }
        }
        if(l1!=null && flag==0){
            ListNode node=new ListNode(l1.val);
             if(l2==null){
                   l2=node;
                   l3=node;
               }else{
                   l3.next=node;
                   l3=node;
               }
        }
        return l2;
    }
}
