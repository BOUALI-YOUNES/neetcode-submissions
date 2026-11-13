class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];
        HashMap<Integer , Integer > map = new HashMap<>();
        for(int i = 0 ; i < length ; i++) {
            int diff = target - nums[i];
            if(!map.containsKey(diff)) {
                map.put(nums[i] , i);
            } else {
                result[0] = map.get(diff);
                result[1] = i;
                return result;
            }
        }
        
        return result;
    }
}
