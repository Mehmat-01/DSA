class Solution {
    public int countAtMost(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        int r = 0, l = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        while (r < n) {
            mpp.put(nums[r], mpp.getOrDefault(nums[r], 0) + 1);
            while (mpp.size() > k) {
                mpp.put(nums[l], mpp.getOrDefault(nums[l], 0) - 1);
                if (mpp.get(nums[l]) <= 0) {
                    mpp.remove(nums[l]);
                }
                l++;
            }
            res += r - l + 1;
            r++;
        }
        return res;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return countAtMost(nums, k) - countAtMost(nums, k - 1);
    }
}