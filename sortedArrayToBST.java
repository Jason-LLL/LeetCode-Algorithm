public class Solution
{
	public TreeNode sortedArrayToBST(int[] nums)
	{
		if (nums==null||nums.length==0)
		{
			return null;
		}
		return getTreeNode(nums,0,nums.length-1);

	}
    private TreeNode getTreeNode(int[] nums,int start,int end)
    {
       if(start>end)
       return null;
       int  middle=start+(end-start)/2;
       TreeNode head = new TreeNode(nums[middle]);
       head.left=getTreeNode(nums,start,middle-1);
       head.right=getTreeNode(nums,middle+1,end);
       return head;	
    }
}