// 22. Generate Parentheses

/*
 Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 
 For example, given n = 3, a solution set is:
 
 [
 "((()))",
 "(()())",
 "(())()",
 "()(())",
 "()()()"
 ]

*/

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        String str = "";
        genPar(n, 0, 0, str, res);
        return res;
    }
    public void genPar(int n, int left, int right, String str, List<String> res) {
        if(left == n && right == n) {
            res.add(str);
            return;
        }
        if(left < n) {
            str += '(';
            genPar(n, left+1, right, str, res);
            String newStr = str.substring(0,str.length()-1);
            str = newStr;
        }
        if(right < left) {
            str += ')';
            genPar(n, left, right+1, str, res);
            String newStr = str.substring(0,str.length()-1);
            str = newStr;
        }
    }
    
    /*
     List<String> res = new ArrayList<String>();
     String str = "";
     genPar(n, 0, 0, str, res);
     return res;
     }
     public void genPar(int n, int left, int right, String str, List<String> res) {
     if(left == n && right == n) {
     res.add(str);
     return;
     }
     if(left < n) {
     genPar(n, left+1, right, str+'(', res);
     }
     if(right < left) {
     genPar(n, left, right+1, str+')', res);
     }
     }*/
}
