public class Solution {
    public int climbStairs(int n) {
        
        int a=0,b=1,c;
        for(int i=1;i<=n;i++){
            c=a+b;
            if(i==n){
                return c;
            }
            
            a=b;
            b=c;
        }
        return 0;
    }
}
