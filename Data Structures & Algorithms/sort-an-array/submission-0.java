class Solution {
    public int[] sortArray(int[] nums) {
        // we will use the heap sort
        int n = nums.length;
        buildMaxHeap(nums);
        for (int end = n - 1; end > 0; end--) {
            int temp = nums[0];
            nums[0] = nums[end];
            nums[end] = temp;
            sift(nums, end, 0); 
        }
        return nums;
    }
}
private void buildMaxHeap(int[] arr) {
    int length = arr.length;
    for (int i = length / 2; i >= 0; i--) {
        sift(arr, length, i);
    }
}
private void sift(int[] arr, int n, int i) {
    int parent = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    if (left < n && arr[left] > arr[parent]) {
        parent = left;
    }
    if (right < n && arr[right] > arr[parent]) {
        parent = right;
    }
    if (parent != i) {
        int tmp = arr[i];
        arr[i] = arr[parent];
        arr[parent] = tmp;
        sift(arr, n, parent);
    }
}
