class Solution {
    int res = Integer.MIN_VALUE;

    int rec(TreeNode root) {
        if (root == null) return 0;

        int l = Math.max(0, rec(root.left));  
        int r = Math.max(0, rec(root.right));

        
        res = Math.max(res, l + r + root.val);

        return Math.max(l, r) + root.val;
    }

    public int maxPathSum(TreeNode root) {
        rec(root);
        return res;
    }
}
