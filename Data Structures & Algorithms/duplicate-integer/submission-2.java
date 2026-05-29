class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        Set<Integer> set = new HashSet<>();
        for(int el : nums){
            if(!set.add(el)){
                return true;
            }
        }
        return false;
    }
}