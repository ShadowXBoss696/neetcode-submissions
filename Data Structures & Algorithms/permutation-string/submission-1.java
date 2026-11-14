class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int N1 = s1.length(), N2 = s2.length();

        if (N2 < N1) return false;

        int[] freqS1 = new int[26];
        int[] freqS2 = new int[26];

        for (int i = 0; i < N1; i++) {
            freqS1[s1.charAt(i) - 'a']++;
            freqS2[s2.charAt(i) - 'a']++;
        }

        if (isSame(freqS1, freqS2)) return true;

        for (int j = N1; j < N2; j++) {
            freqS2[s2.charAt(j-N1) - 'a']--;
            freqS2[s2.charAt(j) - 'a']++;

            if (isSame(freqS1, freqS2)) return true;
        }

        return false;
    }

    private boolean isSame(int[] freqS1, int[] freqS2) {
        for (int i = 0; i < 26; i++) {
            if (freqS1[i] != freqS2[i]) return false;
        }
        return true;
    }
}
