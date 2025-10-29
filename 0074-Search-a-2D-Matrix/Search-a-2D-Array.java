class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int l = 0, h = rows - 1;

        while (l <= h) {
            int m = (l + h) / 2;
            if (matrix[m][0] <= target && matrix[m][cols - 1] >= target) {
                int low = 0, high = cols - 1;
                while (low <= high) {
                    int mid = (low + high) / 2;
                    if (matrix[m][mid] == target) return true;
                    else if (matrix[m][mid] > target) high = mid - 1;
                    else low = mid + 1;
                }
                return false;
            } else if (matrix[m][0] > target) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }
}
