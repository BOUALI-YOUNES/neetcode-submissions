class Solution {
    public void sortColors(int[] nums) {
        int left = 0 ;
        int right = nums.length - 1 ; 
        int mid = 0;
        while(mid <= right) {
            if(nums[mid] == 0) {
                swap(left , mid , nums);
                left++; mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else if(nums[mid] == 2) {
                swap(mid,right,nums);
                right--;
            }
        }
    }
    private void swap(int left , int right , int[] nums) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
}