class Solution {
    private boolean canLoad(int[] weight,int capacity,int days){
        int count = 1;        
        int LoadSum = 0;
        for (int j = 0; j < weight.length; j++) {
            if (LoadSum + weight[j] > capacity) { 
                count++;
                LoadSum = 0;
            }
            LoadSum += weight[j];
        }
        return count <= days;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int sum=0,maxi=0;
        for(int i:weights){
            sum+=i;
            maxi=Math.max(maxi,i);
        }
        int low=maxi;
        int high=sum;
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canLoad(weights,mid,days)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}