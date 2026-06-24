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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> tem = new ArrayList<>();
            for(int i=0;i<s;i++){
               TreeNode a = q.poll();
               tem.add(a.val);
               if(a.left!=null)q.add(a.left);
               if(a.right!=null) q.add(a.right);
            }
            ans.add(new ArrayList<>(tem));
        }
        return ans;
    }
}
