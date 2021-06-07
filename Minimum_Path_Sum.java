class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int [][]ans=new int[m][n];
        ans[0][0]=grid[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0&&j==0)continue;
                int above=0,left=0;
                if(j-1>=0){
                    left=ans[i][j-1];
                }else left=Integer.MAX_VALUE;
                if(i-1>=0){
                    above=ans[i-1][j];
                }else above=Integer.MAX_VALUE;
                
                ans[i][j]=Math.min(left,above)+grid[i][j];
            }
        }
        return ans[m-1][n-1];
    }
}
