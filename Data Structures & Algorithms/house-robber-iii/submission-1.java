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
    static HashMap<TreeNode,Integer> map;
    static int rec(TreeNode root){
        if(root==null) return 0;
        if(map.containsKey(root)) return map.get(root);
        int pick = root.val+(root.left==null?0:(rec(root.left.left)+rec(root.left.right)))+(root.right==null?0:(rec(root.right.left)+rec(root.right.right)));
        int skip =rec(root.left)+rec(root.right);
        int ans=Math.max(pick,skip);
         map.put(root,ans);
         return ans; 
    }
    public int rob(TreeNode root) {
        map=new HashMap<>();
        return rec(root);
    }
}