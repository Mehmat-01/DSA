class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;
                int maxi = 0;
                int mini = n + 1;
                for (int value : freq) {
                    if (value > 0) {
                        maxi = Math.max(maxi, value);
                        mini = Math.min(mini, value);
                    }
                }
                sum += maxi - mini;
            }
        }
        return sum;
    }
}