class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1,sufix=1;
        int n=nums.length;
        int max_value=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           if(prefix==0) prefix=1;
           if(sufix==0) sufix=1;
           prefix*= nums[i];
           sufix*=nums[n-i-1];
           max_value=Math.max(max_value,Math.max(prefix,sufix));
        }
        
        return max_value;
    }
}