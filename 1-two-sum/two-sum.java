class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> ans=new HashMap<>();
        int n= nums.length;

        for(int i=0; i<n; i++){
            int complement= target - nums[i];

            if(ans.containsKey(complement)){
                return new int[]{ans.get(complement), i};
            }else{
                ans.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}