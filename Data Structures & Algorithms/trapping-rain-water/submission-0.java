class Solution {
    public void setLeftMaxHeight(int arr[], int height[]){
        arr[0] = height[0];
        for(int i=1; i<height.length; i++){
            arr[i] = Math.max(height[i], arr[i-1]);
           // arr[i] = height[i]>height[i-1]?height[i]:height[i-1];
        }
    }
    public void setRightMaxHeight(int arr[], int height[]){
        int n = height.length;
        arr[n-1] = height[n-1];
        for(int i= n-2; i>=0; i--){
            arr[i] = Math.max(height[i], arr[i+1]);
            //arr[i] = height[i]>height[i+1]?height[i]:height[i+1];
        }
    }
    public int trap(int[] height) {
        int n = height.length;
        int rightMaxHeight[] = new int[n];
        int leftMaxHeight[] = new int[n];
        setRightMaxHeight(rightMaxHeight, height);
        setLeftMaxHeight(leftMaxHeight, height);
        int total =0;
        for(int i=0; i<n; i++){
            int min = Math.min(rightMaxHeight[i], leftMaxHeight[i]);
            total= total+(min-height[i]);
        }
        return total;
    }
}
