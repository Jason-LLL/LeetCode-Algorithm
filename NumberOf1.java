public class Solution {
    public int NumberOf1(int n) {
        int count=0;   
        while(n!=0)
            {
        if((n & 1)==1)
           count++;
           n=n>>>1;// 无符号右移
           }
           return count;
    }
}
/*
public class Solution{
public int  NumberOf1(int n)
{
   int count=0;
   while(n!=0)
   {
      n=n&(n-1);
      count++;
   }
   return count;
}
}
*/