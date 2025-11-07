class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int r=0,l=0,minLen=n+1,sum=0;
        while(r<n){
            sum+=nums[r];
            while(sum>=target){
                sum-=nums[l];
                minLen=Math.min(minLen,r-l+1);
                l++;
            }r++;
        }
        if(minLen==n+1) return 0;
        return minLen;
    }
}