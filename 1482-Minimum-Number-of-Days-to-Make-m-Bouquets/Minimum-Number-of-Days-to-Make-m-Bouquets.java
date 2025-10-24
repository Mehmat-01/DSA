class Solution {
    private boolean canMake(int[] bloom,int day,int m,int k){
        int count=0;
        int noofB=0;
        int n=bloom.length;
        for (int b : bloom) {
            if (b <= day) {
                count++;
                if (count == k) {
                    noofB++;
                    count = 0;
                }
            } else {
                count = 0;
                }
        }
        return noofB >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i:bloomDay){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        int n=bloomDay.length;
        
        int ans=-1;
        int low=min,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
           if(canMake(bloomDay,mid,m,k)){
             ans=mid;
             high=mid-1;
           }else low=mid+1;
        }
        return ans;
    }
}