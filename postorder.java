//后序遍历的非递归
public void postorderTraversa2(TreeNode root)     
    {
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode cur=null;                      //当前结点 
        TreeNode pre=null;                 //前一次访问的结点 
        s.push(root);
        while(!s.empty())
        {
            cur=s.peek();
            if((cur.left==null&&cur.right==null)||
               (cur!=null&&(pre==cur.left||pre==cur.right)))
            {
                list.add(cur.val);  //如果当前结点没有孩子结点或者孩子节点都已被访问过 
                s.pop();
                pre=cur; 
            }
            else
            {
                if(cur.right!=null)
                    s.push(cur.right);
                if(cur.left!=null)    
                    s.push(cur.left);
            }
        }    
    }
    ///////
    --------------------------------
     Node<Integer> rNode = null;  
        Node<Integer> current = root;  
        Srack <Integer> stack = new Stack<Integer>();  
        while(current != null || !stack.isEmpty()) {  
            while(current != null) {  
                stack.push(current);  
                current = current.getLeftChild();  
            }  
            current = stack.pop();  
            while (current != null && (current.getRightChild() == null ||current.getRightChild() == rNode)) {  
                System.out.print(current.getValue());  
                rNode = current;  
                if (stack.isEmpty()){  
                    System.out.println();  
                    return;  
                }  
                current = stack.pop();  
            }  
            stack.push(current);  
            current = current.getRightChild();  
        }  