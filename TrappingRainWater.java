// 42. Trapping Rain Water

/*

 Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 
 For example,
 Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.



*/



public class Solution {
    public int trap(int[] height) {
        if(height.length < 3) return 0;
        int[] leftToright = new int[height.length];
        int[] rightToleft = new int[height.length];
        leftToright[0] = height[0];
        for(int i = 1; i < height.length; i++) {
            leftToright[i] = Math.max(leftToright[i-1], height[i]);
        }
        
        rightToleft[height.length-1] = height[height.length-1];
        int res = Math.min(leftToright[height.length-1], rightToleft[height.length-1]) - height[height.length-1];
        for(int i = height.length-2; i >= 0; i--) {
            rightToleft[i] = Math.max(rightToleft[i+1], height[i]);
            res += Math.min(leftToright[i], rightToleft[i]) - height[i];
        }
        /*
         int res = 0;
         for(int i = 0; i < height.length; i++) {
         res += Math.min(leftToright[i], rightToleft[i]) - height[i];
         }*/
        return res;
    }
}
