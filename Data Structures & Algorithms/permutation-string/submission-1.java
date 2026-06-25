class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;

        char[] s1Arr=s1.toCharArray();
        Arrays.sort(s1Arr);
        String sortedS1 = new String(s1Arr);
        int lenS2 = s2.length();
        for(int i=0; i<lenS2; i++){
            for(int j=i; j<lenS2; j++){
                char[]strArr = s2.substring(i,j+1).toCharArray();
                Arrays.sort(strArr);
                String str = new String(strArr);
                if(sortedS1.equals(str)) return true;
            }
        }
        return false;
    }
}
