class Solution {
    public int arrayPairSum(int[] nums) {

        //Sort the array
        Arrays.sort(nums);

        //Store the answer by adding
        int sum=0;

        //take every second element
        for(int i=0; i<nums.length; i+=2){  //there is not need to check righ side of thhe pair as right will be always greatr then left
            sum+=nums[i];
        }

        //Returning Max sum
        return sum;
        
    }
}