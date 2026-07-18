class Solution {
    public void merge(int []nums, int left, int right){
        if(left>=right) return;
        int mid = (left+right)/2;
        merge(nums, left, mid);
        merge(nums,mid+1, right);
        merge(nums,left,mid, right);

    }
    public void merge(int []nums, int left,int mid, int right){
        int temp[] = new int[right-left+1];
        int i=left, j=mid+1;
        int k =0;
        while(i<=mid && j<=right){
            if(nums[i]<nums[j]){
                temp[k++]=nums[i++];
            }
            else temp[k++]=nums[j++];
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=right){
            temp[k++]=nums[j++];
        }
        for(i=0; i<temp.length; i++){
            nums[i+left]=temp[i];
        }
    }
   
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        merge(nums, 0, n-1);
        return nums;
        
    }
}