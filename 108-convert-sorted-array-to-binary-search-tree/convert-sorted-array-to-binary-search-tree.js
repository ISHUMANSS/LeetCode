/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {number[]} nums
 * @return {TreeNode}
 */
var sortedArrayToBST = function(nums) {
    //if it is smaller go to the left if it is larger go to the right
    //need to find the root and then we can go from there
    //we want the root to be like the middle or something
    //use recursion to be able to loop through all the numbers
    
    function btree(left, right){
        //node is fine
        if(left > right){
            return null;
        }

        //get mid
        const mid = Math.floor((left + right) / 2);
        const node = new TreeNode(nums[mid]);

        //balance the tree recursively
        node.left = btree(left, mid - 1);
        node.right = btree(mid +1, right);

        return node;
    }

    return btree(0, nums.length -1);


    
};