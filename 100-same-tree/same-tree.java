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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        //I could like loop through the whole of both trees doing like depth first searching keeping 2 arrays 
        //of like all the nodes in each tree and then after both are checked we just compare the arrays

        //but that would be slow so it would be much smarter to like
        //recursevly check the left tree for both nodes and then recursivley check the right tree for both nodes

        //base case
        //both trees are null
        //this means at this node they are identical
        if(p == null && q == null){
            return true;
        }

        //check to see if they are diffrent
        if(p == null || q == null || p.val != q.val){
            return false;
        }

        //check recursivley
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

        
    }
}