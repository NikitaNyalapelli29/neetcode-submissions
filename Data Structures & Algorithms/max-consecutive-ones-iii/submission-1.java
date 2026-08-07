class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int maxLength=0, n=nums.length, zero=0;
        int l=0, r=0;
        while(r<n){
            if(nums[r] == 0) zero++;
            while(zero>k){
                if(nums[l]==0) zero--;
                l++;
                
            }
            if(zero<=k){
                maxLength = r-l+1 > maxLength ? r-l+1 : maxLength;
            }
            r++;
        }
        return maxLength;
    }
}