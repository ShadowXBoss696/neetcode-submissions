class Solution {
    public int[] twoSum(int[] nums, int target) {
        int N = nums.length;

        Map<Integer, Integer> visited = new HashMap<>();

        for (int i = 0; i < N; i++) {
            Integer idx = visited.get(target - nums[i]);
            if (idx != null) {
                return new int[] {idx, i};
            }
            visited.put(nums[i], i);
        }

        return new int[0];
    }
}
