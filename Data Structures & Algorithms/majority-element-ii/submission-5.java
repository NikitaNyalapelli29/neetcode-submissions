class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int n = nums.length;
        for(Map.Entry<Integer, Integer> entrySet : map.entrySet())  {
            if(entrySet.getValue()>n/3)
                list.add(entrySet.getKey());
        }
        return list;
    }
}