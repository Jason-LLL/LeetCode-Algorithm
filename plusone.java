public class Solution {
    public int[] plusOne(int[] digits) {
        /*   int c = 1; // 令进位标识初始值为1
           int len=digits.length;
       for(int i=len-1;i>=0;i--)
          {
              // 不断处理进位
             int a = digits[i] + c;
             digits[i] = a % 10;
             c = a / 10;
         }
         // 如果最后还有进位，则在数组最前面在插入1
         if(c == 1)
           {
               
           }
         return newdigit;
         */
         
    int n = digits.length;
   }
    
    int[] newNumber = new int [n+1];
    newNumber[0] = 1;
    
    return newNumber;
    }
}   for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
  