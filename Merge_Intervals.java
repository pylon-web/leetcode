class Solution {
    public int[][] merge(int[][] intervals) {
        int l=intervals.length;
        Arrays.sort(intervals, (a, b) -> Double.compare(a[0], b[0]));
        int i=0,j=1;
        int[][] ans=new int[l][2];
        for(i=0;i<l;i++){
            
            if(i==0){
                ans[0][0]=intervals[0][0];
                ans[0][1]=intervals[0][1];
            }else{
                if(intervals[i][0]<=ans[j-1][1]){
                    if(intervals[i][1]>=ans[j-1][1]){
                    if(ans[j-1][0]>intervals[i][0])ans[j-1][0]=intervals[i][0];
                    ans[j-1][1]=intervals[i][1];}
                    
                }else{
                    ans[j][0]=intervals[i][0];
                    ans[j][1]=intervals[i][1];
                    j++;
                }
            }
            
        }
        int[][] a=new int[j][2];
        for(int k=0;k<j;k++){
            a[k][0]=ans[k][0];
            a[k][1]=ans[k][1];
        }
       // System.out.println(ans);
        return a;
    }
}
