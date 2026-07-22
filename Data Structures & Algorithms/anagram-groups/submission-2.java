class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String i : strs){
            char charArr[] = i.toCharArray();
            Arrays.sort(charArr);
            String key = String.valueOf(charArr);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(i);
        }
        return new ArrayList<>(map.values());

    }
}
