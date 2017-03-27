/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//双指针法，先让第一个指针走k-1步，到达地k个节点。 然后再让两个指针一起走，等到第一个指针到末尾时，第二个指针恰好到倒数第k个节点
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
                 if(head==null||k<=0) return null;
            ListNode fn = head;
            ListNode sn = head;
         for (int i=1;i<k;i++)
             {
             if(fn.next!=null)
             fn=fn.next;
        else
            return null;
         }
          while(fn.next!=null)
              {
              fn=fn.next;
              sn=sn.next;
}
        return sn;
        
    }
}