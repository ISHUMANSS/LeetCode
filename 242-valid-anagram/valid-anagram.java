class Solution {
    public boolean isAnagram(String s, String t) {

        //not most effective but like I could try and sort both of them

        boolean result = false;

        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);

        if(Arrays.equals(sarr, tarr)){
            result = true;
        }

        return result;
        
    }
}