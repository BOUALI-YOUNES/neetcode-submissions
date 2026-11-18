class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int j = 0;
        for(int i = 0 ; i < 3 ;i++) {
            int idx = map.getOrDefault(i , 0);
            for(int c = 0 ; c < idx ; c++) {
                nums[j++] = i;
            }

        }
    }
}