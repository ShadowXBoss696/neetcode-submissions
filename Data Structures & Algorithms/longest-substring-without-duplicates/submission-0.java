class Solution {
    public int lengthOfLongestSubstring(String s) {
        int N = s.length();

        Set<Character> curr = new HashSet<>();

        int i = 0, j = 0, maxLen = 0;
        while (j < N) {
            char ch = s.charAt(j);

            while (i < j && curr.contains(ch)) {
                curr.remove(s.charAt(i));
                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);
            curr.add(ch);
            j++;
        }

        return maxLen;
    }
}
