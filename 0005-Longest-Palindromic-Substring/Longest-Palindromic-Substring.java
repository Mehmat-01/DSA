class Solution {
    private int maxLen = 0;
    private int start = 0;
    public void expandArroundCentre(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            if(maxLen<r-l+1){
                maxLen=r-l+1;
                start=l;
            }
            l--;
            r++;
        }
    }
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        for(int  i=0;i<s.length();i++){
            expandArroundCentre(s,i,i);
            expandArroundCentre(s,i,i+1);
        }
        return s.substring(start,start+maxLen);

    }
}