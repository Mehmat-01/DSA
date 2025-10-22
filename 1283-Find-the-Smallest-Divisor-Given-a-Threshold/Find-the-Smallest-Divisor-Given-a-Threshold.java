class Solution {
    public int SumofD(int[] nums, int div) {
        int sum = 0;
        for (int num : nums) {
            sum += (int) Math.ceil((double) num / div);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int low = 1, high = max;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (SumofD(nums, mid) <= threshold) {
                high = mid - 1;  
            } else {
                low = mid + 1;  
            }
        }
        return low;
    }
}
