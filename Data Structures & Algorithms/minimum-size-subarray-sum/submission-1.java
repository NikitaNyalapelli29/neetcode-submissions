class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int[] prefixArr = new int[n];
        int length = Integer.MAX_VALUE;
        prefixArr[0] = nums[0];
        for(int i=1; i<n; i++){
            prefixArr[i] = nums[i]+prefixArr[i-1];
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                int sum =  j!=0? prefixArr[i]-prefixArr[j-1]: prefixArr[i];
                if(sum>=target)
                    length = (i-j)+1<length?(i-j)+1:length;
                else break;
            }
        }
        return length == Integer.MAX_VALUE? 0: length;
    }
}