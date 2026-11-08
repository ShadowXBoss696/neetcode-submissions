class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] prefixMul = new int[N];
        int[] suffixMul = new int[N];

        int prod = 1;
        for (int i = 0; i < N; i++) {
            prod *= nums[i];
            prefixMul[i] = prod;
        }

        prod = 1;
        for (int i = N-1; i >= 0; i--) {
            prod *= nums[i];
            suffixMul[i] = prod;
        }

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            int prefix = i > 0 ? prefixMul[i-1] : 1;
            int suffix = i < N-1 ? suffixMul[i+1] : 1;
            ans[i] = prefix * suffix;
        }

        return ans;
    }
}  
