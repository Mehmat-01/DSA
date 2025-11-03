class Solution {
    private static final Map<Character, Integer> ROMAN = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    public int romanToInt(String s) {
        int total = 0;
        int n = s.length();

        for (int i = 0; i < n - 1; i++) {
            int curr = ROMAN.get(s.charAt(i));
            int next = ROMAN.get(s.charAt(i + 1));
            total += curr < next ? -curr : curr;
        }

        return total + ROMAN.get(s.charAt(n - 1));
    }
}
