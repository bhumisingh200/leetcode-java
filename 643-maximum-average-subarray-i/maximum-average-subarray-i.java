class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        
        //1. Calculate Sum of the first window
        int sum=0;

        for(int i=0; i<k; i++ ){
            sum+=nums[i];
        }

        //2. This is the maximum sum initially
        int maxSum=sum;

        //3. Slide the window
        for(int i=k; i<n; i++){

            //Remove the elment leaving the window
            sum-=nums[i-k];

            //Add the new element entering the window
            sum+=nums[i];

            //Update maxiumum sum
            maxSum=Math.max(maxSum,sum);
        }
        return (double) maxSum/k;
    }
}