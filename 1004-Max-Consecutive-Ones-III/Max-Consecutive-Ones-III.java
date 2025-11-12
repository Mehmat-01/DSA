class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int n = nums.length;
        int l = 0, r = 0;
        int zeroes = 0;
        while (r < n) {
            if (nums[r] == 0)
                zeroes++;
            while (zeroes > k) {
                if (nums[l] == 0)
                    zeroes--;
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}