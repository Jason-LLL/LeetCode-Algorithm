//这是新开辟了一个字符串来做替换。
public class Solution {
    public String replaceSpace(StringBuffer str) {
    	if(str==null)
            return null;
        StringBuilder nstr = new StringBuilder();
        for (int i=0;i<str.length();i++)
            {
            if(str.charAt(i)==' ')
                {
                nstr.append('%');
                nstr.append('2');
                nstr.append('0');
            }else
                {
                nstr.append(str.charAt(i));
            }
        }
        return nstr.toString();
    }
}
//在原有的字符串基础上做替换,Stringbuilder的setCharAt(int index,char a)替换字符;setLength()为重新设置字符串长度
// 从前往后替换，后面的字符要不断往后移动，要多次移动，所以效率低下
     // 从后往前，先计算需要多少空间，然后从后往前移动，则每个字符只为移动一次，这样效率更高一点。
public class Solution {
    public String replaceSpace(StringBuffer str) {
        int spacenum = 0;//记录空格的数量
        for (int i=0;i<str.length();i++ ) {
           if(str.charAt(i)==' ')
            spacenum++;
        }
        int indexold=str.length()-1;
        int newLength = str.length()+2*spacenum;
        int indexnew = newLength-1;
        str.setLength(newLength);
        for(;indexold>=0&&indexold<str.length();indexold--)
        {
            if(str.charAt(indexold)==' ')
            {
                str.setCharAt(indexnew--,'0');
                str.setCharAt(indexnew--,'2');
                str.setCharAt(indexnew--,'%');
            }
            else
            {
                str.setCharAt(indexnew--,str.charAt(indexold));
            }
        }
        return str.toString();
    }
}