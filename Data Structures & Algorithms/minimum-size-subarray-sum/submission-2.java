class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l =0, sum=0, n=nums.length;
        int len = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            while(sum>=target){
                len = len<(i-l)+1?len:(i-l)+1;
                sum=sum-nums[l];
                l++;
            }
        }
        return len == Integer.MAX_VALUE? 0: len;
    }
}