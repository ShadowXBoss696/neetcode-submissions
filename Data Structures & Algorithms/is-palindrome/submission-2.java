class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int N = s.length();
        int i = 0, j = N-1;
        while (i < j) {
            while (i <= N-1 && !isAlphaNumeric(s.charAt(i))) i++;
            while (j >= 0 && !isAlphaNumeric(s.charAt(j))) j--;

            if (i <= N-1 && j >= 0 && s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }

        return true;
    }

    private boolean isAlphaNumeric(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }
}
