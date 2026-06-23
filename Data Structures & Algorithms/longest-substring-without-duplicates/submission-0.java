class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        int count =0;
        int n = s.length();
        for(int i=0; i<n; i++){
            String ch = String.valueOf(s.charAt(i));
            int idx = sb.indexOf(ch);
            if(idx == -1){
                sb.append(ch);
            }
            else {
                sb.delete(0,idx+1);
                sb.append(ch);
            }
            count = count<sb.length()?sb.length():count;
        }
        return count;
    }
}
