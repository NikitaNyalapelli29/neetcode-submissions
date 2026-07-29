class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int longest = 1, count =0;
        int prev = Integer.MIN_VALUE;

        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){

            if(prev == nums[i]-1){
                count++;
                prev++;
            }
            else if(prev != nums[i]){
                count = 1;
                prev = nums[i];
            }

            longest = count > longest ? count : longest;
        }
        return longest;
    }
}
