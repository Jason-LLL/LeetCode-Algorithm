public class Solution {
    public int lengthOfLastWord(String s) {
       String use = s.trim();
    int count = 0;
    for (int i = use.length() - 1; i >= 0; i--) {
        if (use.charAt(i) != ' ') count++;
        else break;
    }
    return count;
    }
}
/*双指针法
  int idx = s.length() - 1;
        // 跳过末尾的空格
        while(idx >= 0){
            if(s.charAt(idx) != ' ') break;
            idx--;
        }
        // 记录结束位置
        int end = idx;
        // 如果已经超界返回0
        if(idx < 0) return 0;
        // 找到开始位置
        while(idx >= 0){
            if(s.charAt(idx) == ' ') break;
            idx--;
        }
        return end - idx;
        
        
        
//API法
 public int lengthOfLastWord(String s) {
        return s.trim().split(" +")[s.trim().split(" +").length - 1].length();
    }
*/