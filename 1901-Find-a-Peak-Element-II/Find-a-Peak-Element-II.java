class Solution {
    
    public int maxElement(int[][] mat, int row) {
        int n = mat[0].length;
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (mat[row][i] > max) {
                max = mat[row][i];
                index = i;
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int low = 0, high = m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int col = maxElement(mat, mid);

            int up = mid - 1 >= 0 ? mat[mid - 1][col] : Integer.MIN_VALUE;
            int down = mid + 1 < m ? mat[mid + 1][col] : Integer.MIN_VALUE;

            if (mat[mid][col] > up && mat[mid][col] > down) {
                return new int[]{mid, col};
            } else if (mat[mid][col] < down) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}