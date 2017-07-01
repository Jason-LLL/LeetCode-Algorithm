//查找环的入口点
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null||pHead.next==null)
          return null;
        ListNode fast = new ListNode(0);
        ListNode slow = new ListNode(0);
        
        slow=pHead.next;
        fast=pHead.next.next;
        while(fast!=slow)
            {
               slow=slow.next;
               fast=fast.next.next;
        }
        fast=pHead;
        while(fast!=null)
            {
            if(fast==slow)
                return fast;
            slow=slow.next;
            fast=fast.next;
       }
        return slow;
    }
}

/*
   c++实现
   
   class Solution {
public:
    ListNode* EntryNodeOfLoop(ListNode* pHead)
    {
         if(pHead==NULL || pHead->next==NULL)
            return NULL;
        set<ListNode*> listSet;
        while(pHead!=NULL){
            
            //说明没有找到pHead
            if(listSet.find(pHead)==listSet.end()){
                listSet.insert(pHead);
                pHead=pHead->next;
            }
            else
                return pHead;
        }
        return NULL;
    }
};

*/