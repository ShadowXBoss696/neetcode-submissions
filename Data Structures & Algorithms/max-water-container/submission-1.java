class Solution {
    public int maxArea(int[] heights) {
        int N = heights.length;
        int maxArea = 0;

        int i = 0, j = N-1;
        while (i < j) {
            int area = calcArea(heights, i, j);
            if (area > maxArea) {
                maxArea = area;
            }

            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;
    }

    private int calcArea(int[] heights, int i, int j) {
        return (j-i) * Math.min(heights[i], heights[j]);
    }
}
