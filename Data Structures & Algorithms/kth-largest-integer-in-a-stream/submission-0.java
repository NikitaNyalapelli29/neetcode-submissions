class KthLargest {
    ArrayList <Integer> list = new ArrayList<>();
    int k;

    public KthLargest(int k, int[] nums) {
        for(int i: nums)
            list.add(i);
        
        this.k = k;
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        int n = list.size();
        Collections.reverse(list);
        return list.get(k-1);
    }
}
