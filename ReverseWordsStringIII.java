/*
Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:

Input: s = "Mr Ding"
Output: "rM gniD" */
class ReverseWordsStringIII {
    public String reverseWords(String s) {
        String ans="";
        String[]str=s.split(" ");
        for(int i=0;i<str.length;i++)
        {
            String ss=rev(str[i]);
            ans+=ss;
            if(i != str.length-1)
            {
                ans+=" ";
            }
        }
        return ans;
    }
    public static String rev(String s)
    {
        String revstr="";
        for(int i=s.length()-1;i>=0;i--)
        {
            revstr+=s.charAt(i);
        }
        return revstr;
    }
}



--->  leetcode best answer......!!!

class ReverseWordsStringIII {
    public String reverseWords(String s) {
        char[] cs = s.toCharArray();
        int i = 0, j = 0;
        int n = s.length();
        while (i < n) {
            while (j < n && cs[j] != ' ') {
                j++;
            }
            reverse(cs, i, j>=n?n-1:j-1);
            i = j+1;
            j = i;
        }
        return new String(cs);
    }

    public void reverse(char[] cs, int i, int j) {
        char temp;
        while (i < j) {
            temp = cs[i];
            cs[i++] = cs[j];
            cs[j--] = temp;
        }
    }
}
