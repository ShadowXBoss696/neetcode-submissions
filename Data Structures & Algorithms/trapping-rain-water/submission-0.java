class Solution {
    public int trap(int[] height) {
        int N = height.length;
        if (N == 0) return 0;

        int[] prefix = new int[N];
        int[] suffix = new int[N];

        prefix[0] = height[0];
        for (int i = 1; i < N; i++) {
            prefix[i] = Math.max(prefix[i-1], height[i]);
        }

        suffix[N-1] = height[N-1];
        for (int i = N-2; i >= 0; i--) {
            suffix[i] = Math.max(suffix[i+1], height[i]);
        }


        int result = 0;
        for (int i = 1; i < N; i++) {
            result += Math.min(prefix[i], suffix[i]) - height[i];
        }
        return result;
    }
}
