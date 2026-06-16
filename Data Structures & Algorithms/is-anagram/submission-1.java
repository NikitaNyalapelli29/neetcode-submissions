class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        
        if(sLen != tLen) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<sLen; i++){
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            map.put(sChar, map.getOrDefault(sChar, 0)+1);
            map.put(tChar, map.getOrDefault(tChar, 0)-1);
        }
        for(int i : map.values()){
            if(i!=0) return false;
        }
        return true;
        
       
    }
}