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
    static int rec(TreeNode root,int prev){
        if(root==null) return 0;
        if(prev==-101){
            return 1+rec(root.left,Math.max(root.val,prev))+rec(root.right,Math.max(root.val,prev));
        }
        int left = rec(root.left,Math.max(root.val,prev));
        int right=rec(root.right,Math.max(root.val,prev));
        if(root.val>=prev) return 1+left+right;
        return left+right;

    }
    public int goodNodes(TreeNode root) {
        return rec(root,-101);
    }
}
