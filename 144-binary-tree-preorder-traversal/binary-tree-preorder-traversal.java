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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        prehelp(root, ans);
        return ans;

    }

    public void prehelp(TreeNode root, List<Integer> answer){
        //move up the tree
        if(root == null) return;

        //add the number to the list
        answer.add(root.val);
        //go as far left as it can
        prehelp(root.left, answer);
        //after ther is no more left go right
        prehelp(root.right, answer);
    }
}