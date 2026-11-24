class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] prefix = new int[length];
        int[] postfixe = new int[length];
        int[] result = new int[length];
        for(int i = 0 ; i < length - 1 ; i++) {
            if(i == 0) {
                prefix[i] = 1 * nums[i];
            } else {
                prefix[i] = prefix[i-1] * nums[i];
            }
        }
        for(int j = length - 1 ; j >= 0; j--) {
            if(j == length - 1) {
                postfixe[j] = 1 * nums[j];
            } else {
                postfixe[j] = postfixe[j+1] * nums[j];
            }
        }
        for(int k = 0 ; k < length ; k++) {
            if(k == 0) {
                result[k] = 1 * postfixe[k+1];
            } else if(k == length -1) {
                result[k] = prefix[k-1] * 1;
            } else {
                result[k] = prefix[k-1] * postfixe[k+1];
            }
            
        }
        return result;
    }
}  
