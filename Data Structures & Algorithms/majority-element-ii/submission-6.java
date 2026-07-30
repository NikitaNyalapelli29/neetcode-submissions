class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int count1 = 0;
        int count2 = 0;
        int n1=0, n2=0, n = nums.length;

        for(int i : nums){
            if(i == n1) count1++;
            else if(i == n2) count2++;
            else if(count1 == 0) {
                n1 = i;
                count1++;
            }
            else if(count2 == 0){
                n2 = i;
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0; count2=0;
        for(int i: nums){
            if(n1 == i) count1++;
            if(n2 == i) count2++;
        }
        List<Integer> list = new ArrayList<>();
        if(count1 > n/3) list.add(n1);
        if(count2 > n/3) list.add(n2);

        return list;
    }
}