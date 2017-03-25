/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//1.recursion   
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        
        
        ListNode p= head.next;
        ListNode n= reverseList(p);
        
        head.next=null;
        p.next=head;
        return n;
    }
}
//2.Iteration   
public class Solution{
	public ListNode reverseList(ListNode head)
	{
		if(head==null) return null;
		if(head.next==null) return head;
        ListNode pre = head;
		ListNode p=head.next;
		pre.next=null;
		ListNode nt;
		while(p!=null)
		{
               nt= p.next;
               p.next=pre;
               pre=p;
               p=nt;
		}
		return pre;
	}
}