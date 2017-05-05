//70. Climbing Stairs

/*
 You are climbing a stair case. It takes n steps to reach to the top.
 
 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 
 Note: Given n will be a positive integer.

*/


public class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int[] count = new int[n+1];
        count[1] = 1;
        count[2] = 2;
        for(int i = 3; i < n+1; i++) {
            count[i] = count[i-1] + count[i-2];
        }
        return count[n];
    }
}
/*
 1 1
 2 2
 3 3
 4 5
 5 8
 6 13
 */
