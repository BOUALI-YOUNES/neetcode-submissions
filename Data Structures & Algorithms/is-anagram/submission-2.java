class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }
        int[] chars = new int[26];
        for(int i = 0 ; i < s.length() ; i++) {
            chars[s.charAt(i) - 'a']++;
            chars[t.charAt(i) - 'a']--;
        }
        for(int i = 0 ; i < 26 ; i++) {
            if(chars[i] != 0) {
                return false;
            }
        }
        return true;

        
    }
}

/*HashMap<Character , Integer> map1 = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();

        for(char c : s.toCharArray()) {
            map1.put(c,map1.getOrDefault(c,0) + 1);
        }
        for(char c : t.toCharArray()) {
            map2.put(c,map2.getOrDefault(c,0) + 1);
        }
        if(map1.equals(map2)) {
            return true;
        }
        return false; */
