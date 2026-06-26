class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left=0, right=0;
        int n = s.length();
        int arr[] = new int[256];
        while(right<n){
            int rightAscii = (int)s.charAt(right);
            arr[rightAscii]++;
            while(arr[rightAscii]>1){
                int leftAscii = (int)s.charAt(left);
                arr[leftAscii]--;
                left++;
            }
            int currLen = right-left+1;
            maxLen = currLen>maxLen?currLen:maxLen;
            right++;
        }
        return maxLen;
    }
}
