
/*public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array==null||array.length==0||(array.length==1&&array[0].length==0)) 
            return false ;
        int row = array.length;
        for(int i=0;i<row;i++)
            {
               int col= array[i].length;
               if(target==array[i][col-1])
                   return true;
               if(target<array[i][col-1])
               {
                   for(int j=0;j<col;j++)
                       {
                       if(array[i][j]==target)
                           {
                              return true;
                           }
                       }
               }
            }
        return false;
    }
}
*/
public class Solution {
    public boolean Find(int target, int [][] array)
        {
         int row = array.length-1;
         int i = 0;
         while(row>=0&&i<array[0].length)
             {
             if(target<array[row][i])
             {
                 row--;
             }
            else if(target>array[row][i])
                {
                 i++;
            }
             else{
                 return true;
             }
                 
}
        return false;
    }
}