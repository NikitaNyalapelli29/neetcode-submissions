class Solution {
    public void mergeSort(int []nums, int left, int right){
        if(left>=right) return;
        int mid = left+(right-left)/2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid+1, right);
        mergeSort(nums,left, mid, right);
    }
    public void mergeSort(int[]nums, int left, int mid, int right){
        int temp[] = new int[(right-left)+1];
        int i=left, j=mid+1; 
        int k=0; 

        while(i<=mid && j<=right){
            if(nums[i]<nums[j]){
                temp[k++] = nums[i++];
            }
            else temp[k++] =nums[j++];

        }
        while(i<=mid){
            temp[k++] = nums[i++];
        }
        while(j<=right){
            temp[k++] = nums[j++];
        }
        int n = temp.length;
        for(i=0; i<n; i++){
            nums[i+left] = temp[i];
        }
    }
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        mergeSort(nums, 0, n-1);
       return nums;
        // int temp[] = new int[n];
        // for(int i=0; i<n; i++){
        //     temp[i]=nums[i];
        // }
        // return temp;
    }
}