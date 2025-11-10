class Solution {
    public int minOperations(int[] nums) {
        List<Integer> stack = new ArrayList<>();
        int res = 0;
        for (int n : nums) {
            while (!stack.isEmpty() && stack.get(stack.size() - 1) > n)
                stack.remove(stack.size() - 1);
            if (n == 0)
                continue;
            if (stack.isEmpty() || stack.get(stack.size() - 1) < n) {
                res++;
                stack.add(n);
            }
        }
        return res;
    }
}