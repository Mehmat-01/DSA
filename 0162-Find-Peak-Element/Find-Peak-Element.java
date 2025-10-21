class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid element is greater than the next, 
            // then a peak lies on the left side (including mid)
            if (nums[mid] > nums[mid + 1]) {
                high = mid;
            } else {
                // Else, the peak lies on the right side
                low = mid + 1;
            }
        }
        return low;

    }
}