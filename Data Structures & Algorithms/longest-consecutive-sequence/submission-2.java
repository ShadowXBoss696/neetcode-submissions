class Solution {
    public int longestConsecutive(int[] nums) {
        int N = nums.length;
        int max = 1, cnt = 1;

        if (N == 0) return 0;

        Arrays.sort(nums);

        for (int i = 1; i < N; i++) {
            if (nums[i] == nums[i-1]) continue;
            if (nums[i] - nums[i-1] != 1) cnt = 1;
            else cnt++;
            if (cnt > max) max = cnt;
        }

        return max;
    }
}
