class Solution {
    public String mergeAlternately(String word1, String word2) {
        //char w1[] = word1.toCharArray();
        //char w2[] = word1.toCharArray();
        char w3[] = new char[word1.length()+word2.length()];
        int i=0,j=0,k=0;

        while(k<w3.length){
            if(i<word1.length() && j<word2.length()){
                w3[k++] = word1.charAt(i++);
                w3[k++] = word2.charAt(j++);
            }
            else if(i<word1.length()){
                w3[k++] = word1.charAt(i++);
            }
            else if(j<word2.length()){
                w3[k++] = word2.charAt(j++);
            }
        }
        return String.valueOf(w3);
    }
}