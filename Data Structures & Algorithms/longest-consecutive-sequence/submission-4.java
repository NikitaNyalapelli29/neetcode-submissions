class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set = new HashSet<Integer>();

        for(int i : nums){
            set.add(i);
        }
        int longest = 0;
        for(int i: nums){
            int current =0;
            int element = i;

            while(set.contains(element)){
                current++;
                element++;
            }

            longest = current > longest ? current : longest;
        }
        return longest;
    }
}
