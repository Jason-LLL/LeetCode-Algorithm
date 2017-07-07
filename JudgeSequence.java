import java.util.Arrays;
public class Solution {
    public boolean isContinuous(int [] numbers) {
     if(numbers==null || numbers.length==0)
         return false;
        Arrays.sort(numbers);
        int zeroCount =0, gapCount=0;
        int i=0;
        while (i < numbers.length && numbers[i] == 0) {
        zeroCount++;
        i++;
    }
        int prev =numbers[i++];
        for(;i<numbers.length;i++)
            {
            if(prev==numbers[i])
                return false;
            gapCount+=numbers[i]-prev-1;
            prev=numbers[i];
        }
        if(zeroCount>=gapCount){
            return true;
        }
        else
            return false;
    }
    /*
    public boolean isContinuous(int [] numbers) {
int[]d = new int[14]; 
d[0] = -5; 
int len = numbers.length; 
int max = -1; 
int min = 14; 
for(int i =0;i<len;i++){
    d[numbers[i]]++; 
    f(numbers[i] == 0){
        continue; 
    }
    if(d[numbers[i]]>1){
        return false; 
    }
    if(numbers[i] >max){
        max = numbers[i]; 
    } if(numbers[i] <min){
        min = numbers[i]; 
    }
 
}
if(max -min<5){
    return true; 
}
    return false;
}

    */
}