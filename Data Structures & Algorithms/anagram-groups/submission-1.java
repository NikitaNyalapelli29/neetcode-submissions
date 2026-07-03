class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        

        for(int i=0; i<strs.length; i++){
            char charArr[] = strs[i].toCharArray();
            Arrays.sort(charArr);
            String keyString = String.valueOf(charArr);
            if(!map.containsKey(keyString)){
                map.put(keyString,new ArrayList<>());
            }
            map.get(keyString).add(strs[i]);

        }

        return new ArrayList<>(map.values());
    }
}