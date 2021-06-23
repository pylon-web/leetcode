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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int flag=0;
        ListNode l1=null;
        ListNode l2=null;
        int i=1;
        while(head!=null){
            if(i==left)flag=1;
            if(flag==0){
                ListNode node=new ListNode(head.val);
                if(l1==null){
                    l1=node;
                    l2=node;
                }else{
                    l2.next=node;
                    l2=node;
                }
                i++;
            }else{
                Stack<Integer> stack=new Stack<>();
                while(i!=right){
                    stack.push(head.val);
                    head=head.next;
                    i++;
                }
                stack.push(head.val);
                
                while(!stack.isEmpty()){
                    int a=stack.pop();
                    ListNode node=new ListNode(a);
                if(l1==null){
                    l1=node;
                    l2=node;
                }else{
                    l2.next=node;
                    l2=node;
                }
                }
                flag=0;
            }
            head=head.next;
        }
        return l1;
    }
}
