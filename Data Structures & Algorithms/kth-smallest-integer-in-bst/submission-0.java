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
    static void rec(TreeNode root, List<Integer> lt ){
        if(root==null) return;
        rec(root.left,lt);
        lt.add(root.val);
        rec(root.right,lt);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> lt = new ArrayList<>();
        rec(root,lt);
        return lt.get(k-1);
    }
}
