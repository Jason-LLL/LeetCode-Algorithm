public class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> set = new HashSet<Integer>();
       for(int i: nums)
       {
           if(!set.add(i))
           return true;
           
       }
           return false;
        
    }
}
/*
public  boolean containsDuplicate(int[] nums) {	

     HashSet h = new HashSet();
      for (int i=0;i<nums.length;i++){
		h.add(nums[i]);
      }
      return (h.size()!=nums.length)? true:false;
}
*/