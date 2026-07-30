class Solution {
    public int maxArea(int[] height) {
        int maxWater = Integer.MIN_VALUE;
        int n = height.length;
        for(int i=0; i<n-1; i++){
            //int currWater = 0;
            for(int j=i+1; j<n; j++){
                int minHeight = height[i]<height[j]? height[i]: height[j];
                int width = j-i;
                if(maxWater < minHeight*width)
                    maxWater = minHeight*width;
            }
        }
        return maxWater;
    }
}