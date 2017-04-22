// 113. Path Sum II

/*
 Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 
 For example:
 Given the below binary tree and sum = 22,
       5
      / \
     4   8
    /   / \
   11  13  4
  /  \    / \
 7    2  5   1
 return
 [
 [5,4,11,2],
 [5,8,4,5]
 ]
*/



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        findPath(root, sum, res, result);
        return result;
    }
    public void findPath(TreeNode root, int sum, List<Integer> res, List<List<Integer>> result) {
        if(root == null) return;
        sum = sum - root.val;
        res.add(root.val);
        if(root.left == null && root.right == null) {
            if(sum == 0) {
                result.add(new ArrayList(res));
                res.remove(res.size()-1);
                return;
            }
        }
        findPath(root.left, sum, res, result);
        findPath(root.right, sum, res, result);
        res.remove(res.size()-1);
    }
