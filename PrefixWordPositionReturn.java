Example 1:

Input: sentence = "i love eating burger", searchWord = "burg"
Output: 4
Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
Example 2:

Input: sentence = "this problem is an easy problem", searchWord = "pro"
Output: 2
Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence, but we return 2 as it's the minimal index.
Example 3:

Input: sentence = "i am tired", searchWord = "you"
Output: -1
Explanation: "you" is not a prefix of any word in the sentence.

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int ans=-1;
        String[]str=sentence.split(" ");
        for(int i=0;i<str.length;i++)
        {
            int count=0;
            String s1=str[i];
            if(s1.length()>=searchWord.length())
            {
            for(int j=0;j<searchWord.length();j++)
            {
                if(searchWord.charAt(j)==s1.charAt(j))
                {
                    count++;
                }
            }
            if(count==searchWord.length())
            {
                ans=i+1;
                break;
            }
            }
        }
        return ans;
    }
}

>>>>>>> Leetcode solution

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        int index = 1;
        for(String s: arr){
            if(s.startsWith(searchWord)){
                return index;
            }
            index++;
        }

        return -1;
    }
}