/*
Example 1: 
Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.

Example 2:

Input: s = "", t = "y"
Output: "y"
*/
class FindtheDifference {
    public char findTheDifference(String s, String t) {
        char[]chh=t.toCharArray();
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            for (int j=0;j<chh.length;j++)
            {
                if (ch==chh[j])
                {
                    chh[j]=' ';
                    break;
                }
            }
        }
        char res=' ';
        for(int k=0;k<chh.length;k++)
        {
            if(chh[k] != ' ')
            {
                 res=chh[k];
                 break;
            }
        }
        return res;
    }
}