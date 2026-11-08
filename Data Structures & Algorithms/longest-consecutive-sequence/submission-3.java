class Solution {
    public int longestConsecutive(int[] nums) {
        int N = nums.length;
        int max = 0;

        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < N; i++) {
            visited.add(nums[i]);
        }

        for (int i = 0; i < N; i++) {
            int cnt = 1, a = nums[i] + 1;

            if (i > 0 && visited.contains(nums[i] - 1)) continue;

            while (visited.contains(a)) {
                a++;
                cnt++;
            }

            if (cnt > max) max = cnt;
        }

        return max;
    }
}
