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
    public List<Integer> ms(TreeNode root,List<Integer> l1){
        if(root==null){
            l1.add(0);
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){   
            int n = q.size();
            int sum=0;
            for(int i=0;i<n;i++){
                TreeNode cur = q.poll();
                //int sum=0;
                if(cur!=null){
                    sum=sum+cur.val;
                }
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
            l1.add(sum);
            
        }
        return l1;
    }
    public int maxLevelSum(TreeNode root) {
        if(root== null){
            return 0;
        }
        List<Integer> l1=new ArrayList<>();
        ms(root,l1);
        int k=0;
        int max = Collections.max(l1);
        for(int i=0;i<l1.size();i++){
            if(max==l1.get(i)){
                k=i+1;
                break;
            }
        }
        return k;
    }

}