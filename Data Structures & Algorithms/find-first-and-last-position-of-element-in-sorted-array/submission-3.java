class Solution {
    public int findRight(int []nums, int target, int n){
        int right =-1;
        int l =0;
        int r = n-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                right = mid;
                l = mid+1;
            }
            else if(nums[mid]>target)
                r = mid-1;
            else l = mid +1; 
        }
        return right;
    }
    public int findLeft(int []nums, int target, int n){
        int left = -1;
        int l = 0;
        int r = n-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                left = mid;
                r = mid-1;
            }
            else if(nums[mid]>target)
                r = mid-1;
            else l = mid+1;
        }
        return left;
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = findLeft(nums, target, n);
        int right = findRight(nums, target, n);
       
        return new int[]{left, right};
    }
}