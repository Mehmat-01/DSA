class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length,count=0,preSum=0;
        Map<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        for(int i=0;i<n;i++){
            preSum +=nums[i];
            int remove=preSum-k;
            count+=mpp.getOrDefault(remove,0);
            mpp.put(preSum,mpp.getOrDefault(preSum,0)+1);
        }
        return count;
    }
}