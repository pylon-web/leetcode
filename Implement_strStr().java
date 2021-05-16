class Solution {
    public int strStr(String haystack, String needle) {
        
        int nlen=needle.length();
        if(nlen==0)return 0;
        char a=needle.charAt(0);
        for(int i=0;i<haystack.length()-nlen+1;i++){
            
            char h=haystack.charAt(i);
            if(a==h){
                if(haystack.substring(i,i+nlen).equals(needle))return i;
            }
        }
        return -1;
    }
}
