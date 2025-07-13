/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var minDepth = function(root) {

    //base case
    if(root == null)  return 0;

    //both subtrees are empty
    if(root.left == null && root.right == null){
        return 1;
    }
    
    //if the left subtree is empty 
    //return the depth of right subtree after add 1 
    if(root.left == null){
        return 1 + minDepth(root.right);
    }
    //if the right subtree is empty 
    //return the depth of left subtree add 1
    if(root.right == null){
        return 1 + minDepth(root.left);
    }

    //if it gets here there are no more subtrees to visit
    //pick the minimum out of these two subtrees and return this value after adding 1 to it
    //add cause of the current node
    return Math.min(minDepth(root.left), minDepth(root.right)) + 1;


    
};