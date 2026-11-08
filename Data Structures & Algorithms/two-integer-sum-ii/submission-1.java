class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int N = numbers.length;
        Map<Integer, Integer> visitedIdx = new HashMap<>();

        for (int i = 0; i < N; i++) {
            Integer idx = visitedIdx.get(target - numbers[i]);
            if (idx != null) {
                return new int[] {idx, i + 1};
            }

            visitedIdx.put(numbers[i], i + 1);
        }

        return new int[0];
    }
}
