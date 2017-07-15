/*
求二叉树的深度：递归和层序遍历法
*/
import java.util.Queue;
import java.util.LinkedList;
 
public class Solution {
    public int TreeDepth(TreeNode pRoot)
    {
        if(pRoot == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(pRoot);
        int depth = 0, count = 0, nextCount = 1;
        while(queue.size()!=0){
            TreeNode top = queue.poll();
            count++;
            if(top.left != null){
                queue.add(top.left);
            }
            if(top.right != null){
                queue.add(top.right);
            }
            if(count == nextCount){
                nextCount = queue.size();
                count = 0;
                depth++;
            }
        }
        return depth;
    }
}

// 2递归
import java.lang.Math;
public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;

            int ldis =TreeDepth(root.left);

            int rdis =TreeDepth(root.right);

        return Math.max(ldis,rdis)+1;
    }
}