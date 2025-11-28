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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        posthelper(root, ans);

        return ans;
        
    }

    public void posthelper(TreeNode root, List<Integer> ans){
        //move up
        if(root == null) return;
        //go as far left as possible
        posthelper(root.left, ans);
        //go right if no left
        posthelper(root.right, ans);

        //add the vlaue last making it post order
        ans.add(root.val);

    }
}