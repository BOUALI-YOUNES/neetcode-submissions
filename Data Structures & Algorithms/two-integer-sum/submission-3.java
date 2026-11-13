class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        //target = Math.abs(target);
        //int i = 0;
        //int j = length - 1;
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
/*
for(int idx = 0 ; idx < length ; idx++) {
            int sum = Math.abs(nums[i] + nums[j]);
            if( sum == target) {
                result[0] = i;
                result[1] = j;
            } else if(sum < target) {
                i++;
            } else if(sum > target) {
                j--;
            }
        }
*/