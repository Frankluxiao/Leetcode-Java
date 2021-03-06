//3. Longest Substring Without Repeating Characters

/*
 Given a string, find the length of the longest substring without repeating characters.
 
 Examples:
 
 Given "abcabcbb", the answer is "abc", which the length is 3.
 
 Given "bbbbb", the answer is "b", with the length of 1.
 
 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/


public class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character, Integer> pos = new HashMap<Character, Integer>();
        int res = 0;
        for(int i = 0, j = 0; j < s.length(); j++) {
            if(pos.containsKey(s.charAt(j))) {
                i = Math.max(i, pos.get(s.charAt(j))+1);
            }
            pos.put(s.charAt(j), j);
            res = Math.max(res, j-i+1);
        }
        return res;
        
    }
}

