import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> hs=new HashSet<>();
       for(int n:nums){
        if(!hs.add(n)) return true;
       }
        return false;
    }
}
