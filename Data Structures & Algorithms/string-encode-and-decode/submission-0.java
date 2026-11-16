class Solution {

    private HashMap<Integer ,Integer> map = new HashMap<>();

    public String encode(List<String> strs) {
        StringBuffer result = new StringBuffer();
        int i = 0 ;
        for(String str : strs) {
            result.append(str);
            map.put(i,str.length());
            i++;
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        for(int length : map.values()) {
            String subStr = str.substring(0,length);
            strs.add(subStr);
            str = str.substring(length);
        }
        return strs;
    }
}
