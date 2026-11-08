class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int N = numbers.length;
        int i = 1, j = N;

        while (i < j) {
            int sum = numbers[i-1] + numbers[j-1];
            if (sum == target) {
                return new int[] {i , j};
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }

        return new int[0];
    }
}
