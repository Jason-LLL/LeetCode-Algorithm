class Solution {
public:
    int climbStairs(int n) {
        if(n==0||n==1||n==2) return n;
       int* sol=new int[n];
       sol[0]=1;
       sol[1]=2;
       for(int i=2;i<n;i++)
       {
           sol[i]=sol[i-1]+sol[i-2];
       }
       return sol[n-1];
    }
};