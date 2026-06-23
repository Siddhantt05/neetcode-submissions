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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size()-1;
            for(int i=0;i<s;i++){
                TreeNode tem = q.poll();
                if(tem.left!=null)
                q.add(tem.left);
                if(tem.right!=null)
                q.add(tem.right);
            }
            TreeNode last = q.poll();
            if(last.left!=null)
            q.add(last.left);
            if(last.right!=null)
            q.add(last.right);
            ans.add(last.val);
            
        }
        return ans;
    }
}
