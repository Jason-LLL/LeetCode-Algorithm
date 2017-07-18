public class Solution {
    public int InversePairs(int [] array) {
     if(array==null||array.length==0)
         return 0;
        int [] copy = new int[array.length];
         for(int i=0;i<array.length;i++){
            copy[i]=array[i];
        }
        return mergesort(array,copy,0,array.length-1);
    }
    int mergesort(int [] array,int[] copy,int start,int end){
        if(start==end){
            copy[start]=array[start];
            return 0;
        }
          int mid=(start+end)/2;
        int left =mergesort(copy,array,start,mid);
        int right = mergesort(copy,array,mid+1,end);
        int i=mid,j=end,count=0,index=end;
        while(i>=start&&j>mid){
            if(array[i]>array[j]){
                count+=j-mid;
                copy[index--]=array[i--];
                 if(count>=1000000007)//数值过大求余
                {
                    count%=1000000007;
                }
            }
            else{
                copy[index--]=array[j--];
            }
        }
while(i>=start){
            copy[index--]=array[i--];
        }
        while(j>mid){
            copy[index--]=array[j--];
        }
        return (count+left+right)%1000000007;
    }
}