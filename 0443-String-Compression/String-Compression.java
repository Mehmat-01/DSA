class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int i = 0;
        while (i < chars.length) {
            int count = 0;
            char current = chars[i];
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }
            chars[write++] = current;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }

        }
        return write;
    }
}