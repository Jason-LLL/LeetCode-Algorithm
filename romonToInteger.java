public class Solution {
    public int romanToInt(String s) {
        int len=s.length();
        int len1=len-1;
        int sum=0;
        int[] nums = new int[len];
       for(int i=0;i<len;i++)
        {
            switch(s.charAt(i))
                {
            case 'M':
                nums[i]=1000;
                break;
            case 'D':
                nums[i]=500;
                break;
            case 'C':
                nums[i]=100;
                break;
            case 'L':
                nums[i]=50;
                break;
            case 'X' :
                nums[i]=10;
                break;
            case 'V':
                nums[i]=5;
                break;
            case 'I':
                nums[i]=1;
                break;
                }
         }
         for(int i=0;i<len1;i++)
         {
         if(nums[i]<nums[i+1])
           {
             sum-=nums[i];
           }
           else
           {
               sum+=nums[i];
           }
         }
         return sum+nums[len1];
    }
}