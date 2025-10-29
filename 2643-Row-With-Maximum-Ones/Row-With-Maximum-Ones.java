class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int max_count= -1;
        int index=-1;
        for(int i=0;i<m;i++){
           int count=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count>max_count){
                max_count=count;
                index=i;
            }
        }
        return new int[]{index,max_count};
    }
}