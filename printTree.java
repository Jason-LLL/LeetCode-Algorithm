/*
* 队列LinkedList完成层序遍历，用end记录每层结点数目
*/
public class Solution {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    	 ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	 if(pRoot==null)
    	 	return result;
    	 ListedList<TreeNode> layer = new LinkedList<TreeNode>();
    	 ArrayList<Integer> layerList = new ArrayList<Integer>();

    	 layer.add(pRoot);
    	 int start =0 ,end=1;
    	 while(!layer.isEmpty())
    	 {
               TreeNode p =layer.remove();
               layerList.add(p.val);
               start++;
               if(p.left!=null)
               	layer.add(p.left);
               if(p.right!=null)
               	layer.add(p.right);
               if(start==end)
               {
               	end = layer.size();
               	start=0;
               	result.add(layerList);
               	layerList = new ArrayList<Integer>();
               }
    	 }
    	 return result;
    }
}