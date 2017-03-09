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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
        return lh>rh?lh+1:rh+1;
    }
}