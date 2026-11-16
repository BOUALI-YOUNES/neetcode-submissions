class Solution {
    public String encode(List<String> strs) {
        StringBuffer result = new StringBuffer();
        for(String str : strs) {
            result.append(str.length());
            result.append("#");
            result.append(str);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i = 0;
        while(i<str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            String substr = str.substring(j+1 , j+1+length);
            strs.add(substr);
            i = j + 1 + length;
        }
        return strs;
    }
}
