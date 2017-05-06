// 54.Maximum Subarray
/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
*/

public class Solution {
    public int maxSubArray(int[] nums) {
        int curval = 0;
        int maxval = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            curval = curval > 0 ? curval+nums[i]:nums[i];
            maxval = Math.max(maxval,curval);
        }
        return maxval;
    }
}



/*
 [-2,1,-3,4,-1,2,1,-5,4,2,-8,10]
 -2,1,-2,4, 3,5,6, 1,5,7,-1,10
 0,1, 0,4, 3,5,6, 1,5,7, 0,10
 0: 0
 1: 01,1
 2: 012,12,2
 3: 0123,123,23,3
 4: 01234,1234,234,34,4
 5: 012345,
 */
