class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder merged = new StringBuilder();
       int w1=0, w2=0;
       int len1=word1.length();
       int len2=word2.length();
       
       while(w1<len1 || w2<len2){
        if(w1<len1){
            merged.append(word1.charAt(w1));
            w1++;
        }
        if(w2<len2){
            merged.append(word2.charAt(w2));
            w2++;
        }

       }
        return merged.toString();
    }
}