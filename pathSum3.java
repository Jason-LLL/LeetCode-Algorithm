/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int pathSum(TreeNode root, int sum) {
          if (root == null) return 0;
        return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    private int pathSumFrom(TreeNode node, int sum) {
        if (node == null) return 0;
        return (node.val == sum ? 1 : 0) 
            + pathSumFrom(node.left, sum - node.val) + pathSumFrom(node.right, sum - node.val);
    }
}    
  /*      
       if(root==null)
       return 0;
  return (pathSumFrom(root,sum)+pathSumFrom(root.left,sum)+pathSumFrom(root.right,sum));
    }
    public int pathSumFrom(TreeNode root, int sum)
    {
         if (root==null)     return 0;
         return ((root.val==sum?1:0)+pathSumFrom(root.left,sum-root.val)+pathSumFrom(root.right,sum-root.val));
       
    }
*/

