class Solution {
    public int longestOnes(int[] nums, int k) {

        int left=0;
        int right=0;
        int zeros=0;
        int maxLength=0;

        while(right<nums.length){

            if(nums[right]==0){
                zeros++;
            }
            right++;

            while(zeros>k){

                if(nums[left]==0){
                    zeros--;
                }
                left++;
            }
            int length=right-left;
            maxLength=Math.max(maxLength,length);
        }
        return maxLength;
    }
}