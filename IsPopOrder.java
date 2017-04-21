import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
      Stack<Integer> stack= new Stack<Integer>();
       for (int i=0,j=0;i < pushA.size();i++)
           {
           stack.push(pushA[i]);
           while (j < popA.size() && stack.top()==popA[j])
               {
               stack.pop();
               j++;
           }
}
        return stack.isEmpty();
    }
}
