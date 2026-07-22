class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            //find mid index
            int mid=low+(high-low)/2;  ////Because if low and high are very large integers, low + high can overflow.

            //compare each indexed value with target
            if(nums[mid]==target){       //target found at mid
                return mid;   
            }else if(nums[mid]<target){  //target more then mid index value 
                low=mid+1;
            }else{                       //target less then mid index value
                high=mid-1;
            }

        }
        return -1;
        
    }
}