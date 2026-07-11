class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int [m+n];
        int idx1=0, idx2=0, i=0;
        while(idx1<m && idx2<n){
            if(nums1[idx1]<nums2[idx2])
                arr[i++] = nums1[idx1++];
            else arr[i++] = nums2[idx2++];
        }
        while(idx1<m){
            arr[i++] = nums1[idx1++];
        }
        while(idx2<n){
            arr[i++] = nums2[idx2++];
        }
        for(i=0; i<m+n; i++){
            nums1[i] = arr[i];
        }
    }
}