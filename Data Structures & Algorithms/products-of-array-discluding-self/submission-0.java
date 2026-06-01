class Solution {
    public static int sum(int []arr, int s, int e){
        int sum =1, n = arr.length;
        for(int i=s; i<=e; i++){
            sum = sum*arr[i];
        }
        return sum;
    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        arr[0] = sum(nums, 1, n-1);
        for(int i=1; i<n-1; i++){
            arr[i] = sum(nums, i+1, n-1)* sum(nums, 0, i-1);
        }
        arr[n-1] = sum(nums,0,n-2);
        return arr;
    }
}  
