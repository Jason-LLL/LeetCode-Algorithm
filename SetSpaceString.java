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