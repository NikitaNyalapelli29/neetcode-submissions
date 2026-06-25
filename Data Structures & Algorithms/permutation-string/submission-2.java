class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;

        int[]count1 = new int[26];
        int[]count2 = new int[26];

        for(int i=0; i<s1.length(); i++){
            count1[s1.charAt(i)-'a']++;
            count2[s2.charAt(i)-'a']++;
        }
        int found=0;
        for(int i=0; i<26; i++){
            if(count1[i]==count2[i])
                found++;
        }
        int left =0, lenS1 = s1.length(), lenS2 = s2.length();
        for(int r=lenS1; r<lenS2; r++){
            if(found==26) return true;

            int index = s2.charAt(r)-'a';
            count2[index]++;
            if(count1[index]==count2[index])
                found++;
            else if(count1[index]+1 == count2[index])
                found--;
            
            index = s2.charAt(left)-'a';
            count2[index]--;
            if(count1[index]==count2[index])
                found++;
            else if(count1[index]-1==count2[index])
                found--;
            left++;
        }
        return found==26;

    }
}
