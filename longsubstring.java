public class Solution {
    public int lengthOfLongestSubstring(String s) {
int len=s.length();
if(len==0) return 0;
 HashMap<Character, Integer> map = new HashMap<Character, Integer>();
int max=0;
for(int i=0,j=0;i<len;i++)
{
   if(map.containsKey(s.charAt(i)))
   {
      j=Math.max(j,map.get(s.charAt(i))+1);
   }
   map.put(s.charAt(i),i);
   max=Math.max(max,i-j+1);
}
return max;

    }
}