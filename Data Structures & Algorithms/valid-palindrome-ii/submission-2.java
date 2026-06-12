class Solution {
    public boolean isPalindrome(String str) {
        int s = 0, e = str.length() - 1;
        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        if (isPalindrome(s)) return true;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            String afterDelete = s.substring(0, i) + s.substring(i + 1);
            if (isPalindrome(afterDelete)) {
                return true;
            }
        }
        return false;
    }
}