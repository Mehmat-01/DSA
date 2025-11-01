class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrS=s.toCharArray();
        char[] arrT=t.toCharArray();
         if(arrS.length != arrT.length) return false;
        Arrays.sort(arrS);
        Arrays.sort(arrT);       
        return Arrays.equals(arrS, arrT);
    }
}