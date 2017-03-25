public class Solution {
    public boolean isHappy(int n) {
          Set<Integer> iloop = new HashSet<Integer>();//set是一个很巧妙的点。   
          int squarenum,remain;
          while(iloop.add(n))//当不能再往里面添加时，说明之前已经有该数字了，但是并没有返回true。所以直接可以返回false
          {
              squarenum=0;
              while(n>0)
              {
                  remain=n%10;
                  squarenum+=remain*remain;
                  n=n/10;
              }
              if(squarenum==1)
              return true;
              else
              n=squarenum;
          }
          return false;
    }
}