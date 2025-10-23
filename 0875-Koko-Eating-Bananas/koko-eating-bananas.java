class Solution {
    public boolean canFinish(int[] piles, int h, int k) {
        long hours = 0;
        for (int pile : piles) {
            hours += pile / k;
            if (pile % k != 0) hours++;
        }
        return hours <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max_value=0;
        for(int i=0;i<piles.length;i++){
            max_value=Math.max(max_value,piles[i]);
        }
        int ans =max_value;
        int low=1,high=max_value;
        while(low<=high){
            int mid=(low+high)/2;
            if(canFinish(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}