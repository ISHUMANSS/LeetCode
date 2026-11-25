class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //the list to contain all of the answers
        List<List<Integer>> res = new ArrayList<>();

        //the inside set
        List<Integer> subset = new ArrayList<>();

        createSubset(nums, 0, res, subset);
        return res;        
    }

    private void createSubset(int[] nums, int index, List<List<Integer>> res, List<Integer> subset) {
        //base case
        if (index == nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }

        //add all the trees
        subset.add(nums[index]);
        createSubset(nums, index + 1, res, subset);

        //remove dups
        subset.remove(subset.size() - 1);
        //beeopp boop
        createSubset(nums, index + 1, res, subset);
    }    
}