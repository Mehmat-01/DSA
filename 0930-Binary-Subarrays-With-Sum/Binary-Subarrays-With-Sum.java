class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int count=0;int preSum=0;
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++){
            preSum+=nums[i];
            int remove=preSum-goal;
            count += hm.getOrDefault(remove,0);
            hm.put(preSum,hm.getOrDefault(preSum,0)+1);
        }
        return count;
    }
}