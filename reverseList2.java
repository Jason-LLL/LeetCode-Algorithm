/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//当前节点是head，pre为当前节点的前一节点，next为当前节点的下一节点
        //需要pre和next的目的是让当前节点从pre->head->next1->next2变成pre<-head next1->next2
        //即pre让节点可以反转所指方向，但反转之后如果不用next节点保存next1节点的话，此单链表就此断开了
        //所以需要用到pre和next两个节点
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head==null) return null;
        ListNode next=null;
        ListNode pre =null;
        while(head!=null)
           //做循环，如果当前节点不为空的话，始终执行此循环，此循环的目的就是让当前节点从指向next到指向pre            
//如此就可以做到反转链表的效果           
//先用next保存head的下一个节点的信息，保证单链表不会因为失去head节点的原next节点而就此断裂
        {
            next=head.next;
            head.next=pre;
            pre = head;
            head=next;
        }
        return pre;
    }
}