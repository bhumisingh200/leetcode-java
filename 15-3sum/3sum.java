class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //1.Sort Array
        Arrays.sort(nums);

        //2.Initilizing a list inside a list to store the 3element together
        List<List<Integer>> result=new ArrayList<>();

        //3.Fix an element
        for(int i=0; i<nums.length-2; i++){

            //Check if its not duplicate
            if(i>0 && nums[i]==nums[i-1]){   //useing if here as while loop will cause infinite loop error
                continue;                    //The continue sends execution back to the nearest condition loop 
            }

            //The two pointers
            int left=i+1;
            int right=nums.length-1;

            //Move left and right 
            while(left<right){

                int sum = nums[i] + nums[left] + nums[right];

                //Binary Search Algorithm
                //If triple element found
                if(sum==0){

                    result.add(Arrays.asList(
                        nums[i],
                        nums[left],
                        nums[right]
                    ));
                    left++;
                    right--;

                    //Check for any left duplicate
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    //Check for any right duplicate
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                //Sum is too big
                else if(sum<0){
                    left++;
                }
                //Sum is too small
                else{
                    right--;
                }
            }
        }
        return result;
    }
}