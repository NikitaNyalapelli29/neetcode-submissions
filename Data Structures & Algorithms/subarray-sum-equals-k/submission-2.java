class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 0) return 0;
        int prefix[] = new int [nums.length];
        prefix[0] = nums[0];

        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }

        int count =0;
        for(int l=0; l<nums.length; l++){
            for(int r=l; r<nums.length; r++){
                int sum = l==0?prefix[r]: prefix[r]-prefix[l-1];
                if(sum==k) count++;
            }
        }
        return count;
    }
}