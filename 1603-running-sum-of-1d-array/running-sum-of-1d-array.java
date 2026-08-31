//Space Complexity is O(n) & Time complexity is O(n)
/*class Solution {
    public int[] runningSum(int[] nums) {

        int n=nums.length;
        int[] runningsum=new int[n];
        int prefixsum=0;

        for(int i=0; i<nums.length; i++){
            prefixsum+=nums[i];
            runningsum[i]+=prefixsum;
        }
        return runningsum;
    }
}*/

//for even lesser O(n) to O(1) time complexity & Time complexity is O(n)
class Solution {
    public int[] runningSum(int[] nums) {

        for(int i=1; i<nums.length; i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}