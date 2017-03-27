public class Solution {
    public int RectCover(int target) {
       // 还是利用了斐波那契数列
        if(target==0)
            return 0;
        if(target==1)
            return 1;
        int t1=1;
        int t2=1;
        
        while(target-->1)
            {
            t1+=t2;
            t2=t1-t2;
        }
        return t1;
    }
}