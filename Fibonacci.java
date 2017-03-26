public class Solution {
    public int Fibonacci(int n) {
        if(n==0) return 0;
       if(n<3) 
           return 1;
      // else
         //  return Fibonacci(n-1)+Fibonacci(n-2);//递归系统会用一个超大的n来让你Stack overflow 所以不考虑
        // 故下面使用迭代法
        int f1=1;
        int f2=1;
        while(n-->2)
            {
            f1+=f2;
            f2=f1-f2;
        }
        return f1;
    }
}