class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int N = s.length();
        int i = 0, j = N-1;
        while (i < j) {
            while (i <= N-1 && !isAlpha(s.charAt(i))) i++;
            while (j >= 0 && !isAlpha(s.charAt(j))) j--;

            if (i <= N-1 && j >= 0 && s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }

        return true;
    }

    private boolean isAlpha(char ch) {
        return ch >= 'a' && ch <= 'z';
    }
}
