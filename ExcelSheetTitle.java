public class Solution {
    public String convertToTitle(int n) {
        /*
        if(n==0) return "";
        else
        { 
          n--;
          int i=n/26;
          int j=n%26;
        return convertToTitle(i) + (char)('A' + j);
        }
       */ 
        
        
        return n==0 ? "":convertToTitle(--n/26)+(char)('A'+n%26);
}
}