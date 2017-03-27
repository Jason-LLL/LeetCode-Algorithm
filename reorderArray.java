/*
public class Solution {
    public void reOrderArray(int [] array) {
        for(int i=0;i<array.length;i++)
            {
            for(int j=array.length-1;j>i;j--)
                {
                if(array[j]%2==1&&array[j-1]%2==0)//遇到奇数，前面是一个偶数，可以互换位置。
                    {
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
                }
        }      
    }
}
*/
import java.util.ArrayList;
import java.util.List;
public class Solution{
    public void reOrderArray(int [] array)
        {
        List<Integer> odd = new ArrayList<Integer>();//奇数
        List<Integer> even = new ArrayList<Integer>();//偶数
        int n = array.length;
        int temp = 0;
        for(int i = 0;i < n;i++){
            temp = array[i];
            if(temp % 2 == 1){
                odd.add(temp);
            }else{
                even.add(temp);
            }
        }
        int m = 0;
        for(int j = 0;j < odd.size();j++){
            array[m] = odd.get(j);
            m++;
        }
        for(int k = 0;k < even.size();k++){
            array[m] = even.get(k);
            m++;
        }  
    }
}
