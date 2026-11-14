class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Set<Integer> visitedSet = new HashSet<>();

        for (int n : numbers) {
            if (visitedSet.contains(target - n)) {
                return new int[] {target - n, n};
            }
            visitedSet.add(n);
        }

        return new int[0];
    }
}
