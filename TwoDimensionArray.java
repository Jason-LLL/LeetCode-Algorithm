//二维数组中的查找
思路一：二分查找，对每一行进行二分查找。
public class Solution {
    public boolean Find(int target, int [][] array) {
             for(int i=0;i<array.length;i++)// 二维数组，array.length代表的是行数，array[i].length代表的是每一行对应的列数。
                  {
                  int low=0;
                  int high=array[i].length-1;
                 //由于数组的有序性，利用二分查找
                  while(low<=high){
                  int mid=(low+high)/2;
                  if(target<array[i][mid])
                      high=mid-1;
                    
                  else if(target>array[i][mid])
                      {
                      low=mid+1;
                  }
                  else
                      return true;
                 }
             }
              
        return false;  
    }
}
//思路二：利用数组的从左往右递增，从上往下递增.
//先将target与数组右上角或者左下角的数进行比较，再进行行或列的变化
public class Solution{
   public boolean Find(int target, int [][] array)
   {
     int row=0;
     int col=array[0].length-1;
     while(row<array.length&&col>=0)
     {
      if(target==array[row][col])
        return true;
      else if(target>array[row][col])
      {
        row++;
      }else
      {
        col--;
      }

     }
     return false;
   }
}