//524. Longest Word in Dictionary through Deleting
/*
Given a string and a string dictionary, find the longest string in the dictionary that can be formed by deleting some characters of the given string. If there are more than one possible results, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.

Example 1:
Input:
s = "abpcplea", d = ["ale","apple","monkey","plea"]

Output:
"apple"
Example 2:
Input:
s = "abpcplea", d = ["a","b","c"]

Output:
"a"
Note:
All the strings in the input will only contain lower-case letters.
The size of the dictionary won't exceed 1,000.
The length of all the strings in the input won't exceed 1,000.
*/

public class Solution {
    /*
     public static Comparator<String> strComp = new Comparator<String>() {
        public int compare(String a, String b) {
        if(a.length() != b.length()) return b.length() - a.length();
        return a.compareTo(b);
        }
     };
     public String findLongestWord(String s, List<String> d) {
        Collections.sort(d, strComp);
        for(int i = 0; i < d.size(); i++) {
            if(d.get(i).length() > s.length()) continue;
            String tmp = d.get(i);
            int k = 0;                            // k: index of tmp
            for(int j = 0; j < s.length(); j++) { // j: index of s
                if(tmp.charAt(k) == s.charAt(j)) k++;
                if(k >= tmp.length()) return tmp;
            }
        }
        return "";
     }
     
     
     public String findLongestWord(String s, List<String> d) {
        Collections.sort(d, new Comparator<String>() {
        public int compare(String a, String b) {
            if(a.length() != b.length()) return b.length() - a.length();
            return a.compareTo(b);
            }
        });
        for(int i = 0; i < d.size(); i++) {
            if(d.get(i).length() > s.length()) continue;
            String tmp = d.get(i);
            int k = 0;                            // k: index of tmp
            for(int j = 0; j < s.length(); j++) { // j: index of s
                if(tmp.charAt(k) == s.charAt(j)) k++;
                if(k >= tmp.length()) return tmp;
            }
        }
        return "";
     }
     */
    
    public String findLongestWord(String s, List<String> d) {
        //Collections.sort(d, (a,b) -> a.length() != b.length() ? -Integer.compare(a.length(), b.length()) :  a.compareTo(b));
        Collections.sort(d, (a,b) -> a.length() != b.length() ? b.length() - a.length() :  a.compareTo(b));
        for(int i = 0; i < d.size(); i++) {
            if(d.get(i).length() > s.length()) continue;
            String tmp = d.get(i);
            int k = 0;                            // k: index of tmp
            for(int j = 0; j < s.length(); j++) { // j: index of s
                if(tmp.charAt(k) == s.charAt(j)) k++;
                if(k >= tmp.length()) return tmp;
            }
        }
        return "";
    }
    
}
