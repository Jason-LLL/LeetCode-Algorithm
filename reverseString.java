public class Solution {
    public String ReverseSentence(String str) {
        if(str==null) return null;
        if(str.trim().equals(""))return str;
        StringBuilder sb = new StringBuilder();
        String[] strings = str.split(" ");
        int length=strings.length;
        for(int i=length-1;i>=0;i--){
            if(i==0)
                sb.append(strings[i]);
            else{
                sb.append(strings[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}