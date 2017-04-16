//Iterstion法
public class Solution{
	public ListNiode reverseList( ListNiode head)
	{
		ListNiode pre = head;
		ListNiode p=head.next;
		head.next=null;
		while(p！=null)
		{
			ListNode temp=p.next;
			p.next=pre;
			pre=p;
			p=temp;
          
		}
		return pre;
	}
}
//recursion
public class Solution
{
	public ListNiode reverseList(ListNiode head)
	{
		if(head==null) return null;
		if(head.next=null) return head;
		ListNode p = head.next;
		ListNode n=reverseList(p)
		head.next=null;
		p.next=head;
		return n;
	}
}	