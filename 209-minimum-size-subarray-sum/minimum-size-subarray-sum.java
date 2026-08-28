class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left=0;
        int right=0;
        int sum=0;
        int minlength=nums.length+1;

        
        while(right<nums.length){

            //Expand
            sum+=nums[right];
            right++;

            //While sum is enough
            while(sum>=target){

                int length=right-left;
                minlength=Math.min(minlength,length);

                //Shrink
                sum-=nums[left];
                left++;
            }
        }
        if(minlength==nums.length+1){
            return 0;
        }
        return minlength;
    }
}

//Time Complexity: O(n)
//Space Compleity: O(1)