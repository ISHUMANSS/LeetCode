class Solution {
    public boolean reorderedPowerOf2(int n) {
        String target = sortDigits(n);
        for (int i = 0; i < 31; i++) {//2^0 to 2^30 covers all int range
            int power = 1 << i;//2^i
            if (target.equals(sortDigits(power))) {
                return true;
            }
        }
        return false;
    }

    private String sortDigits(int num) {
        //creating a sort digits class so it can make it an array so we can find the best digits
        char[] arr = String.valueOf(num).toCharArray();
        //sort the aray
        Arrays.sort(arr);
        return new String(arr);
    }
}