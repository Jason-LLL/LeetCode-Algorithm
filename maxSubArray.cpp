class Solution {
public:
    int maxSubArray(vector<int>& nums) {
       /*
       int maxSoFar =nums[0],maxEndingHere=nums[0];
        for(int i=1;i<nums.size();i++)
        {
            maxEndingHere=(maxEndingHere+nums[i])>nums[i]?maxEndingHere+nums[i]:nums[i];
            maxSoFar=maxSoFar>maxEndingHere?maxSoFar:maxEndingHere;
            
        }
        return maxSoFar;
        */
        int i,sum=0;
        int len=nums.size();
        int ans=nums[0];
        for(i=0;i<len;i++)
        {
         sum+=nums[i];
         ans=max(sum,ans);
         sum=max(sum,0);
        }
        return ans;
    }
};