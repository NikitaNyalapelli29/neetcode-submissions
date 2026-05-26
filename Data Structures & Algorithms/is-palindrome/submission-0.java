class Solution {
    public static boolean isAplhaNum(char ch){
        if((ch>=97 && ch<=122)|| (ch>=48 && ch<=57)||(ch>=65 && ch<=90))
            return true;
        return false;
    }
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length()-1;
        while(l<r){
            if(!isAplhaNum(s.charAt(l))){
                l++;
                continue;
            }
            if(!isAplhaNum(s.charAt(r))){
                r--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;
            
            l++; r--;
        }
        return true;
    }
}
