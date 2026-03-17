class Solution {
    public int largestSubmatrix(int[][] matrix){
        int m=matrix.length,n=matrix[0].length;
        int values[]=new int[n];
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0) values[j]=0;
                else values[j]++;
            }
            int help[]=Arrays.copyOf(values,values.length);
            Arrays.sort(help);
            int max=i+1;
            for(int k=n-1;k>=0;k--){
                max=Math.min(max,help[k]);
                ans=Math.max(ans,max*(n-k));
            }
        }
        return ans;
    }
}