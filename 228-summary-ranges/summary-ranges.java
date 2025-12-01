class Solution {
    public List<String> summaryRanges(int[] nums) {
      List<String> ans=new ArrayList<>();
        if(nums==null || nums.length==0) return ans;

        int start=nums[0];
        int prev=nums[0];

        for(int i=1;i<nums.length;i++){
            int curr=nums[i];

            if(curr==prev+1){
                prev=curr;
            }

            else{
                addRange(ans,start,prev);
                start=curr;
                prev=curr;
            }
        }
        addRange(ans,start,prev);
        return ans;
    }

    private void addRange(List<String> ans,int start,int end){
        if(start==end) ans.add(String.valueOf(start));

        else{
            ans.add(start+"->"+end);
        }
    }
}