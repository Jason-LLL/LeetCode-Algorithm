public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
     boolean [] b = new boolean[length];
        for(int i=0;i<b.length;i++)
            {
            if(b[numbers[i]]==true)
                {
                duplication[0]=numbers[i];
                return true;
            }
            b[numbers[i]]=true;
 }
        return false;

        /*
            StringBuffer sb = new StringBuffer(); 
        for(int i = 0; i < length; i++){
                sb.append(numbers[i] + "");
            }
        for(int j = 0; j < length; j++){
            //indexOf 返回的是此参数在string中的缩影
            if(sb.indexOf(numbers[j]+"") != sb.lastIndexOf(numbers[j]+"")){
                duplication[0] = numbers[j];
                return true;
            }
        }
        return false;
        */
    }
}