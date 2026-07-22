class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;   //Because if low and high are very large integers, low + high can overflow.
            
            if (nums[mid] == target){
                return mid;           // target found
            }else if (nums[mid] < target){
                low = mid + 1;        // search right
            }else{
                high = mid - 1;       // search left
            }
        }
        
        return low; // target not found, return insert position(a position where it must be inserted)
        
    }
}