class Solution {
    public int longestOnes(int[] nums, int k) {

        int right=0;
        int left=0;
        int zero=0;
        int maxlength=0;

        while(right<nums.length){

            //Expand
            if(nums[right]==0){
                zero++;
            }
            right++;

            //To many zeros then shrink the window
            while(zero>k){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            //Check each window if valid
            int length=right-left;
            maxlength=Math.max(maxlength,length);
        }
        return maxlength;
    }
}