class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //1.Sort the array
        Arrays.sort(nums);

        //To store all answers
        List<List<Integer>> result=new ArrayList<>();

        //2.Fix one element
        for(int i=0; i<nums.length-2; i++){//why -2? bcs When i is fixed, we need at least 2 elements after i for left and right

            //Skip duplicate fixed number
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            //3.Two Pointer
            int left=i+1;
            int right=nums.length-1;

            while(left<right){

                int sum=nums[i]+nums[left]+nums[right];

                //Found a triple
                if(sum==0){ 
                    result.add(Arrays.asList(
                        nums[i],
                        nums[left],
                        nums[right]
                    ));
                    left++;
                    right--;

                    //Skip duplicate left value
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    //Skip duplicate right value
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                //Sum is too big
                else if(sum>0){
                    right--;
                }
                //Sum is too small
                else{
                    left++;
                }
            }
        }
        return result;
    }
}