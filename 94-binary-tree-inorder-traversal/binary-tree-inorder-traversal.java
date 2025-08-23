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
    public List<Integer> inorderTraversal(TreeNode root) {
        //need to go full left
        //and then like pop out

        //use recursion and stuff

        List<Integer> res = new ArrayList<>();

        //run the traversal
        inorder(root, res);

        return res;

    }

    private void inorder(TreeNode node, List<Integer> res){
        //there is nothing return
        if (node == null) {
            return;
        }
        //run it with the left node
        inorder(node.left, res);
        //add the node to the list
        res.add(node.val);

        //run it with the right node
        inorder(node.right, res);

    }
}