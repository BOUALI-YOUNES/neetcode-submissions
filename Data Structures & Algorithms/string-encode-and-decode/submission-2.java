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
       /* for(int i = 0 ; i < str.length() ; i++) {
            char del = str.charAt(i);
            if(del == '#') {
                int length = str.charAt(i-1) - '0';
                String substr = str.substring(i+1 , i+1+length);
                strs.add(substr);
            }
        }*/
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
