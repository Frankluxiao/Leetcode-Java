//7. Reverse Integer
/*

 Reverse digits of an integer.
 
 Example1: x = 123, return 321
 Example2: x = -123, return -321
 
*/

public class Solution {
    public int reverse(int x) {
        boolean neg = false;
        if(x < 0) neg = true;
        x = Math.abs(x);
        int res = 0;
        while(x > 0) {
            int resNew = 10*res + x%10;
            if((resNew - x%10) / 10 != res) return 0;
            x /= 10;
            res = resNew;
        }
        if(neg) return -1*(int)res;
        return res;
    }
}
