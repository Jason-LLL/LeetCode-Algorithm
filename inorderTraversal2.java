//递归中序遍历二叉树
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
            if(root!=null){
                inorderTraversal(root.left);
                list.add(root.val);
                inorderTraversal(root.right);
            }
            return list;
        }
 //非递归中序遍历二叉树
        public ArrayList<Integer> inorderTraversal2(TreeNode root){
        	Stack<Integer> stack = new Stack<Integer>();
        	while(!stack.isEmpty()||root!=null)
        {
        	while(root!=null)
        	{
        		stack.push(root);
        		root=root.left;
        	}
        	root = stack.pop();
        	list.add(root.val);
        	root=root.right;//每pop出一个左节点，先把他的值放到list里面，再去看看它是否有兄弟（即它的父节点是否有右儿子）
        }
        return list；
        }
