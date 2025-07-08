class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (n > m) return "";

        int[] hash = new int[256];
        for (int i = 0; i < n; i++) {
            hash[t.charAt(i)]++;
        }

        int left = 0, right = 0, count = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;

        while (right < m) {
            char ch = s.charAt(right);
            if (hash[ch] > 0) count++;
            hash[ch]--;
            right++;

            while (count == n) {
                if (right - left < minLen) {
                    minLen = right - left;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);
                hash[leftChar]++;
                if (hash[leftChar] > 0) count--;
                left++;
            }
        }

        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLen);
    }
}
