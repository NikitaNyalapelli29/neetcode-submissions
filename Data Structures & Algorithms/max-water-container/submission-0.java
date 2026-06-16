class Solution {
    public int maxArea(int[] heights) {
        int h = heights.length;
        int maxWater = 0;
        for(int left=0; left<h-1; left++){
            for(int right=left+1; right<h; right++){
                int width = right-left;
                int height = (heights[left]> heights[right])?heights[right]:heights[left];
                int currWater = height*width;
                maxWater = currWater>maxWater?currWater:maxWater;
            }
        }
        return maxWater;
    }
}
