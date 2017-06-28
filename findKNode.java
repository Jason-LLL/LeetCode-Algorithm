import java.util.ArrayList;
public class Solution {
    ArrayList<TreeNode> list = new ArrayList<TreeNode>();
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot==null||k<=0)
            return null;
        MidSearch(pRoot);
        if(k>list.size())
            return null;
        return list.get(k-1);
         
    }
        void MidSearch(TreeNode pRoot)
            {
            if(pRoot==null)
                return ;
            MidSearch(pRoot.left);
            list.add(pRoot);
            MidSearch(pRoot.right);
        }
       
       
}
添加笔记
