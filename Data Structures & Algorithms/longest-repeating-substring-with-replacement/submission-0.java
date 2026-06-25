class Solution {
    public int characterReplacement(String s, int k) {
        int result =0;
        for(int i=0; i<s.length(); i++){
            HashMap<Character,Integer> map = new HashMap<>();
            int maxfreq=0;
            for(int j=i; j<s.length(); j++){
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
                maxfreq = Math.max(maxfreq, map.get(s.charAt(j)));
                if((j-i+1)-maxfreq<=k){
                    result = Math.max(result, j-i+1);
                }
            }
        }
        return result;
    }
}
