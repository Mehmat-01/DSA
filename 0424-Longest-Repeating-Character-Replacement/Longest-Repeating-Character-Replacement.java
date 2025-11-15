class Solution {
    public int characterReplacement(String s, int k) {
       int n=s.length();
       int maxLen=0;
       int r=0,l=0;
       int[] freq=new int[26];
       int maxfreq=0;
       while(r<n){
            freq[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(r)-'A']);
        
            while((r - l + 1) - maxfreq > k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxLen=Math.max(r-l+1,maxLen);
            r++;
       }
       return maxLen;
    }
}