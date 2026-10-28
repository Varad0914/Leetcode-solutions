/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        return isSum(root.left,root.right);
    }
    private boolean isSum(TreeNode pp ,TreeNode q){
        if(pp==null && q==null){
            return true;
        }
        if(pp==null || q==null ||pp.val!=q.val)return false;
        return isSum(pp.left,q.right) &&
               isSum(pp.right,q.left);
    }
}