class Solution {
    public int[] twoSum(int[] nums, int target) {
       int result[]=new int[2];
       int n=nums.length;
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i=0; i<n; i++){
        int value = target-nums[i];
        if(map.containsKey(value)){
            result[0] = map.get(value);
            result[1] = i;
            return result;
        }
        map.put(nums[i], i);
       }
       return result;
    }
}