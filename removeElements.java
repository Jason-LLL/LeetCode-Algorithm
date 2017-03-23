/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
       /* if(head==null) return null;
        ListNode ln =head;
        while(ln.next!=null)
        {
            if(ln.next.val==val) ln.next=ln.next.next;
            else
            ln=ln.next;
        }
        return head.val==val?head.next:head;//都是先不考虑头结点，先考虑头结点下一个节点，最后再考虑头结点*/
        ListNode result = head;
        if (result == null) {
            return null;
        } else if (result.val == val) {
            return removeElements(result.next, val);
        } else {
            result.next = removeElements(result.next, val);// 如果头结点的值不等于val，从下一个节点开始迭代，并将其赋值给result.next;
        }
        return result;
        
    }
}
