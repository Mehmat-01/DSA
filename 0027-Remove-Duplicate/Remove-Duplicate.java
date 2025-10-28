class Solution{
    public int removeDuplicate(int[] nums,int val){
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(val!=nums[i]){
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}