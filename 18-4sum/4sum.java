class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        //Sort the array
        Arrays.sort(nums);

        //To store all nums
        List<List<Integer>> result=new ArrayList<>();

        //Fix two element
        for(int i=0; i<nums.length-3; i++){
            for(int j=i+1; j<nums.length-2; j++){    //j must always be after i
                //Skip duplicate fixed number
                if( i>0 && nums[i]==nums[i-1]){
                    continue;
                }

                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }

                //Two Pointer
                int left=j+1;
                int right=nums.length-1;
                
                while(left<right){
                    long sum=(long) nums[i]+nums[j]+nums[right]+nums[left];
                    
                    //If found quadruplets
                    if(sum==target){
                        result.add(Arrays.asList(
                            nums[i],
                            nums[j],
                            nums[left],
                            nums[right]
                        ));

                        left++;
                        right--;

                        while(left<right && nums[left]==nums[left-1]){
                            left++;
                        }
                        while(left<right && nums[right]==nums[right+1]){
                            right--;
                        }
                    }
                    //Sum is too big
                    else if(sum>target){
                        right--;
                    }
                    //Sum is too small
                    else{
                        left++;
                    }
                }

            }
        }
        return result;
    }
}