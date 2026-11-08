class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int N = nums.length;
        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(nums);

        for (int k = 0; k < N-2; k++) {
            int i = k+1, j = N-1;

            while (i < j) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    i++;
                } else if (sum > 0) {
                    j--;
                } else {
                    i++;
                }
            }
        }

        return new ArrayList<>(result);
    }
}
