class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int missing=1;
        
        while(true){
            boolean flag=true;
            for(int j=0; j<n; j++){
                if(missing==nums[j]) {
                    flag=false;
                    break;
                }
            }
            if(flag) return missing;
            missing++;
        }
        
    }
}