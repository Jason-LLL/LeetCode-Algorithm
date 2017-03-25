//利用栈的性质，先把list中的值依次读入栈中，然后在把栈中的元素pop出来
import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Stack<Integer> stk = new Stack<Integer>();
        while(listNode!=null)
            {
            stk.push(listNode.val);
            listNode=listNode.next;
}
      whle(!stk.isEmpty())
      {
         list.add(stk.pop());
      }
       /* int top=stk.size()-1;//栈顶的指针为maxsize-1；
        while(top!=-1)
            {
           // int temp=stk.pop();
            list.add(stk.pop());
            top--;
        }
        */
        return list;
    }
}
//利用迭代的方式进行打印
import java.util.ArrayList;
public class Solution {
    ArrayList<Integer> list=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        
        if(listNode!=null)
        {
            this.printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }
}