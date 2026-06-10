class Solution {
   
    public boolean isRange(char ch){
        return ((ch >= '0' && ch <= '9') || 
                (ch >= 'A' && ch <= 'Z') || 
                (ch >= 'a' && ch <= 'z'));
    }
    
    public boolean isPalindrome(String s) {
        int l =0, r=s.length()-1;
        while(l<r){
            if(!isRange(s.charAt(l))){
                l++;
                continue;
            }
            if(!isRange(s.charAt(r))){
                r--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
