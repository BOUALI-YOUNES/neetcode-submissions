class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String , List<String>> map = new HashMap<>();
        for(String str : strs) {
            int[] chars = new int[26];
            for(int i = 0 ; i < str.length() ; i++) {
                chars[str.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(chars);
            if(!map.containsKey(key)) {
                map.put(key , new ArrayList<>());
            }
            map.get(key).add(str);
        }
        for(List<String> list : map.values()) {
            result.add(list);
        }

        return result;


    }
}
