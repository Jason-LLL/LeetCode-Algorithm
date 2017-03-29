/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null||root2==null) return false;
        return isSubTree(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }
        
    public boolean isSubTree(TreeNode root11,TreeNode root22)
    {
        if(root22==null) return true;
        if(root11==null) return false;
        if(root11.val==root22.val)
            {
            return isSubTree(root11.left,root22.left)&&isSubTree(root11.right,root22.right);
        }
        else
            {
            return false;
        }
        
    }
}
------------------------
/*

思路：参考剑指offer1、首先设置标志位result = false，因为一旦匹配成功result就设为true，剩下的代码不会执行，如果匹配不成功，默认返回false2、
递归思想，如果根节点相同则递归调用DoesTree1HaveTree2（），如果根节点不相同，则判断tree1的左子树和tree2是否相同，再判断右子树和tree2是否相同3、
注意null的条件，HasSubTree中，如果两棵树都不为空才进行判断，DoesTree1HasTree2中，如果Tree2为空，则说明第二棵树遍历完了，即匹配成功，
tree1为空有两种情况（1）如果tree1为空&&tree2不为空说明不匹配，
（2）如果tree1为空，tree2为空，说明匹配。
*/

public class Solution {   
     public boolean HasSubtree(TreeNode root1,TreeNode root2) {      
          boolean result = false;           
         if(root1 != null && root2 != null)
        {               
             if(root1.val == root2.val){                  
             result = DoesTree1HaveTree2(root1,root2); 
        }             
        if(!result){result = HasSubtree(root1.left, root2);}             
        if(!result){result = HasSubtree(root1.right, root2);}       
     }           
     return result;    
      }   
                 public boolean DoesTree1HaveTree2(TreeNode root1,TreeNode root2){           
                     if(root1 == null && root2 != null) return false;       
                         if(root2 == null) return true;            
                    if(root1.val != root2.val) return false;        
                    return DoesTree1HaveTree2(root1.left, root2.left) && DoesTree1HaveTree2(root1.right, root2.right);      
                  }
    }