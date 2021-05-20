class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        if(nums[n-1]==target)return n-1;
        int backup=nums[n-1];
        nums[n-1]=target;
        
        for(int i=0;;i++){
            if(nums[i]==target){
                nums[n-1]=backup;
                if(i<n-1)return i;
                else return -1;
            }
        }
    }
}
