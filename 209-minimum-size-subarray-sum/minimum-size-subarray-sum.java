class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left=0;
        int right=0;
        int sum=0;
        int minLength=nums.length+1;

        while(right<nums.length){
            //Expand
            sum+=nums[right];
            right++;

            //Shrinking window while sum is enough
            while(sum>=target){
                int length=right-left;
                minLength=Math.min(minLength,length);
                sum-=nums[left];
                left++;
            }
        }
        if(minLength==nums.length+1){
            return 0;
        }
        return minLength;
    }
}