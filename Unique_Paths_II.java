class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int [][]ans=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    if(obstacleGrid[i][j]==1){
                        ans[i][j]=0;
                    }
                    else if(i==0 && j==0)ans[i][j]=1;
                    else if(i==0 && j!=0)ans[i][j]=ans[i][j-1];
                    else ans[i][j]=ans[i-1][j];
                    
                }else{
                    if(obstacleGrid[i][j]==1){
                        ans[i][j]=0;
                    }else ans[i][j]=ans[i-1][j]+ans[i][j-1];
                }
            }
        }
        return ans[m-1][n-1];
        
    }
}
