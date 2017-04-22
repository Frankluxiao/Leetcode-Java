// 1. Two Sum
/*
 Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 
 You may assume that each input would have exactly one solution, and you may not use the same element twice.
 
 Example:
 Given nums = [2, 7, 11, 15], target = 9,
 
 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 
*/


public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> visited = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if(visited.containsKey(dif)) {
                res[0] = i;
                res[1] = visited.get(dif);
                return res;
            }
            visited.put(nums[i], i);
        }
        return res;
        
        
        
        /*
         int[] res = new int[2];
         Map<Integer, Integer> visited = new HashMap<Integer, Integer>();
         for(int i = 0; i < nums.length; i++) {
         visited.put(nums[i], i);
         }
         for(int i = 0; i < nums.length; i++) {
         int dif = target - nums[i];
         if(visited.containsKey(dif) && visited.get(dif) != i) {
         res[0] = i;
         res[1] = visited.get(dif);
         return res;
         }
         }
         return res;
         */
        
        
        /*
         int[] res = new int[2];
         int m = nums.length;
         for(int i = 0; i < m; i++) {
         for(int j = 0; j < m; j++) {
         if(i != j && nums[i]+nums[j] == target) {
         res[0] = i;
         res[1] = j;
         return res;
         }
         }
         }
         return res;
         */
    }
}
