class Solution {
    public int maxArea(int[] heights) {
        int N = heights.length;
        int maxArea = 0;

        int i = 0, j = N-1;
        while (i < j) {
            int area = (j-i) * Math.min(heights[i], heights[j]);
            
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
}
