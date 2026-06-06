class Solution {
    public static int max(int n1, int n2){
        return n1>n2?n1:n2;
    }
    public int longestConsecutive(int[] nums) {
        int n = nums.length, maxCount=0;
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int num: nums){
            int curr=num, count=0;
            while(set.contains(curr)){
                count++;
                curr++;
            }
            maxCount = max(maxCount, count);
        }
        return maxCount;
    }
}
