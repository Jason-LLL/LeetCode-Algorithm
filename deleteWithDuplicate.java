/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    
    public ListNode deleteDuplication(ListNode pHead)
    {
       //head为null
        if(pHead==null)
            return null;
        if(pHead.next==null)
            return pHead;
        //临时的头结点
        ListNode root=new ListNode(0);
        root.next = pHead;
        //记录前驱节点
        ListNode prev = root;
        //记录前驱节点
        ListNode node = pHead;
        while(node!=null&&node.next!=null)
            {
            //有重复节点，与node值相同的节点都要删除
            if(node.val==node.next.val){
            while(node.next!=null &&node.next.val==node.val)
                {
                node = node.next;
                }
            prev.next=node.next;
            }
            else{
                prev.next= node;
                prev=prev.next;
            }
            node=node.next;
        }
        return root.next;
       
    }
}