class Solution {
    public int longestOnes(int[] nums, int k) {

        int left=0;
        int right=0;
        int zeros=0;
        int maxLength=0;

        while(right<nums.length){

            //Expand the window
            if(nums[right]==0){
                zeros++;
            }

            right++;

            //Too many zeros -> shrink the window
            while(zeros>k){

                if(nums[left]==0){
                    zeros--;
                }
                left++;
            }
            //Current window is valid
            int length=right-left;
            maxLength=Math.max(maxLength,length);
        }
        return maxLength;
    }
}