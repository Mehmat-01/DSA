class Solution {
    public String largestOddNumber(String s) {
    int index=-1;
    int i;
    // finding odd index
    for(i=s.length()-1;i>=0;i--){
        if((s.charAt(i)-'0')%2==1) {
            index=i;
            break;
        }
    }
    if(index==-1) return "";
    return s.substring(0,index+1);
    }
}