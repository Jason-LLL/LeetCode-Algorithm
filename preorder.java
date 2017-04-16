//二叉树的先序递归
ArrayList<Integer> list =new ArrayList<Integer>();
    //先序递归遍历
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        if(root!=null){
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return list;
    }
// 先序非递归遍历
public ArrayList<Integer> preorderTraversal(TreeNode root)
{
	Stack<TreeNode> stack=new Stack<TreeNode>();
	stack.push(root);
	ArrayList<Integer> list=new ArrayList<Integer>();
	while(!stack.isEmpty())
	{
		ListNode ln = stack.pop();
		list.add(ln.val);
		if(ln.right!=null)
		{
			stack.push(ln.right);//先push到栈里面的后弹出，所以先序遍历要先push右子树节点
		}
		if(ln.left!=null)
		{
            stack.push(ln.left);
		}
	}
	return list;

}
