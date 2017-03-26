import java.util.ArrayList;


//非递减数组旋转之后最小值，也就是寻找分界点，分界点前后都是非递减数组，分界点后面的非递减数组比分界点前面的数组都要小，
//因此对旋转数组按顺序查找，当出现后一个数比前一个小时，这个数就是最小值，若没有出现后一个数比前一个数小的情况，
//这说明这个数组所有的数都相等，返回数组第一个数即可。注意考虑数组为空的情况，返回0
/*public class Solution {
    public int minNumberInRotateArray(int [] array) {
      for (int i = 0; i <array.length-1; i++)
      {		
          if (array[i + 1] < array[i])			
              return array[i + 1];	
      }
        return array[0];
    }
       
        
}*/
//
public class Solution{
    public int minNumberInRotateArray(int [] array){
        int low=0;
        int high=array.length-1;
        while(low < high)
            {
            int mid=(low+high)/2;
            if(array[mid]>array[high])
                {
                low=mid+1;
            }
           else if(array[mid]==array[high])//这一步是为了防止有重复的数出现
              {
                high=high-1;
            }
            else
                high=mid;
        }
        
      return array[low];  
    }
}