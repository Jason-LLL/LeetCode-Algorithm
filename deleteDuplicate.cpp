class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
      ListNode* listNode = head;
      
      while(listNode!=NULL)
      {
          if(listNode->next==NULL)
          {
              break;
          }
          else if(listNode->val==listNode->next->val)
          {
              listNode->next=listNode->next->next;
          }
          else
          listNode=listNode->next;
      }
      return head;
    }
};