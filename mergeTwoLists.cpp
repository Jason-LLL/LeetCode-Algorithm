class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        if(l1==NULL)/* c++中null要大写 java中小写*/
        {
            return l2;
        }
        if(l2==NULL)
        {
            return l1;
        }
        ListNode* mergenode;/*列表节点*/
        if(l1->val<l2->val)
        {
            mergenode=l1;
           mergenode->next= mergeTwoLists(l1->next,l2);
        }
        else
        {
            mergenode=l2;
            mergenode->next=mergeTwoLists(l1,l2->next);
        }
        return mergenode;
    }
};