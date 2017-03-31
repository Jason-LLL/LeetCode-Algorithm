public class Solution {
	Stack<Integer> data =new Stack<Integer>();
	Stack<Integer>min = new Stack<Integer>();
	Integer temp=null;
	public void push(int node)
	{
		if(temp！=null)
		{
			if(node<=temp)
			{
				temp=node;
				min.push(node);
			}
			data.push(node);
		}else
		{
			temp=node;
			data.push(node);
			min.push(node);
		}

	}
	public int  pop()
	{
        return data.pop();
	}
	public int top()
	{
		return data.peek();
	}
	public int min()
	{
		 return min.peek();
	}

}