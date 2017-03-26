import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
        
    }
    
    public int pop() {
        while(!stack1.isEmpty())
            {
            stack2.push(stack1.pop());
}
        int first=stack2.pop();
        //这一步比较关键。在于当stack2中还有值时，必须将其重新push到stack1中，不然等下一个值push到stack1以后，再pop就会出现混乱。
        //目的就是要保证每次pop的时候最先进来的值必须在stack2的顶端。
        while(!stack2.isEmpty())
            {
            stack1.push(stack2.pop());
}
        return first;
       
    }
}