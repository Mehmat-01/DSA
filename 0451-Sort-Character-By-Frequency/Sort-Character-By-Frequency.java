class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        int[] freq=new int[128];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)]++;
        }       
        StringBuilder result=new StringBuilder();
        while(true){
            int maxfreq=0;
            char maxChar=0;
            for(int i=0;i<128;i++){
                if(freq[i]>maxfreq){
                    maxfreq=freq[i];
                    maxChar=(char) i;
                }
            }
            if(maxfreq==0) break;
            for(int i=0;i<maxfreq;i++){
                result.append(maxChar);
            }
            freq[maxChar]=0;
        }
        return result.toString();
    }
}