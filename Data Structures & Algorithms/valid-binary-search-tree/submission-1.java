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
    static List<Integer> lt;
    static void rec(TreeNode root){
        if(root==null) return;
        rec(root.left);
        lt.add(root.val);
        rec(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        lt=new ArrayList<>();
        rec(root);
        if(lt.size()==1) return true;
        for(int i=1;i<lt.size();i++){
            if(lt.get(i-1)>=lt.get(i)) return false;
        }
        return true;
    }
}
