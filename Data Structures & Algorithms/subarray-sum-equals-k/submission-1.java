class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum =0, count=0, n = nums.length;
        int prefix[] = new int[n];
        prefix[0] = nums[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++)
            {
                sum = i==0?prefix[j]: prefix[j]-prefix[i-1];
                if(sum==k) count++;
            }
        }
            return count;
    }
}