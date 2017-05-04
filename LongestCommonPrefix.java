//14. Longest Common Prefix

//Write a function to find the longest common prefix string amongst an array of strings.


public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        if(strs.length < 1 || strs[0].length() < 1) return res;
    A:for(int i = 0; i < strs[0].length(); i++) {
        char c = strs[0].charAt(i);
        for(int j = 1; j < strs.length; j++) {
            if(i >= strs[j].length()) break A;
            if(strs[j].charAt(i) != c) return res;
        }
        res += c;
    }
        return res;
    }
}

//aaaa
//a
