/*public class Solution {
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
}*/
/*
public class Solution {
    public String replaceSpace(StringBuffer str) {
        int length=str.length();
        for(int i=0;i<length;i++)
        {
            if(' '==str.charAt(i))
                {
                str.deleteCharAt(i);
                str.insert(i,"%20");
                length=str.length();
                i=i+2;
            }
        }
        return str.toString();
    }
}
*/

public class Solution {
     public String replaceSpace(StringBuffer str)
     {
        if(str==null)
            {
         return null;
     }
        StringBuffer sb = new StringBuffer();
             for(int i=0;i<str.length();i++)
                 {
                    if(' '==str.charAt(i))
                        {
                        sb.append('%');
                        sb.append('2');
                        sb.append('0');
                    }
                 else
                     {
                         sb.append(str.charAt(i));
                     }
                 }
         return sb.toString();
     }
}
