class Solution {
    public boolean rotateString(String s, String goal) {

        // brute force
        /* for(int i=0;i<s.length();i++){
            String rotated=s.substring(i)+s.substring(0,i);
            if(rotated.equals(goal)) return true;
        }return false;
        */


        // optimal
       if(s.length()!=goal.length()) return false;
       String doubleS=s+s;
       return doubleS.contains(goal);
    }
}