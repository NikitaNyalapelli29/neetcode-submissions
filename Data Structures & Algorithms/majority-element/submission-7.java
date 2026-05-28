class Solution {
    public int majorityElement(int[] nums) {
        int ans=0, count=0;

        for(int i:nums){
            if(count==0){
                ans = i;
            }
            count+=(ans==i)?1:-1;
        }
        return ans;
    }
}