class Solution {
    public int majorityElement(int[] nums) {
        int l=nums.length;
        int count=0, result =0;
        for(int i=0; i<l; i++){
            if(count==0)
                result=nums[i];
            if(nums[i]==result)
                count++;
            else count--;
        }
        return result;
    }
}