class Solution {
    public int maxArea(int[] heights) {
        int h = heights.length;
        int maxWater = 0;
        int l =0, r = h-1;
        while(l<r){
            int width = r-l;
            int height = heights[r]< heights[l]?heights[r]:heights[l];
            int curr = width*height;
            maxWater = maxWater>curr?maxWater:curr;
            if(heights[l]<heights[r]){
                l++;
            }else r--;
        }
        return maxWater;
    }
}
