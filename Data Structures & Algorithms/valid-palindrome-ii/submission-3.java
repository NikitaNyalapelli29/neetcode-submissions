class Solution {
    public boolean isPalindrome(String s){
        int start=0, end = s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l = s.length();
        if(isPalindrome(s)) return true;
        for(int i=1; i<l; i++){
            String str = s.substring(0,i-1)+s.substring(i);
            if(isPalindrome(str)) return true;
        }
        return false;
    }
}