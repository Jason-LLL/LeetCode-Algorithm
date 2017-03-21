public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count =0;
        for(int i=0;i<32;i++)
       {
          if((n&1)==1)
          {
            count++;  
          }
          if(i<31)
          n>>>=1;
       }
       return count;
}
}