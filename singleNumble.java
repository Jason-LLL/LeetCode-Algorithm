public class Solution {
    public int singleNumber(int[] nums) {
  /*      int len=nums.length;
        int i,j;
        for(i=0;i<len;i++)
        {
            for(j=0;j<len;j++)
            {
                if(i==j)
                continue;
                else
                if(nums[i]==nums[j])
                    break;
                else continue;
                
            }
            if(j==len)
            return nums[i];
        }
       return 0;*/
      if(nums==null||nums.length==0)
      return 0;
      int res=0;
      for(int i:nums)
      {
          res=res^i;
      }
      return res;
    }
}