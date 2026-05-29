class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer>entry:map.entrySet()){
            arr.add(new int[]{ entry.getValue(), entry.getKey()});
        }
        arr.sort((x,y)->y[0]-x[0]);
        int ans[] = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = arr.get(i)[1];
        }
        return ans;
    }
}
