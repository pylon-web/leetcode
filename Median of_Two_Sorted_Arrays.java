class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k=nums1.length+nums2.length;
        int [] a=new int[k];
        double ans;
        int r=0;
        
        for(int i=0;i<k;i++){
            if(i<nums1.length){
                a[i]=nums1[i];
            }else{
                a[i]=nums2[r];
                r++;
            }

        }
        Arrays.sort(a);
        int e=k/2;
        
        if(k%2==0){
            System.out.println(a[e]);
            ans=a[e]+a[e-1];
            ans=ans/2;
            return ans;
        }else{
            ans=a[e];
            return ans;
        }
        
    }
}
