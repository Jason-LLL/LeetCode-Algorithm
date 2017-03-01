 #需要修改的代码
 public class Solution {
    public int strStr(String haystack, String needle) {
        int lenh=haystack.length();
        int lenn=needle.length();
        int index=0;
        if (lenh < lenn) {
            return -1;
        } else
        if (lenn == 0) {
            return 0;
        }
        for(int i=0;i<=lenh-lenn;i++)
        {
           if (haystack.substring(i,lenn+i).equals(needle)) {
                return i;
            } 
          
        }
        return -1;
    }
}