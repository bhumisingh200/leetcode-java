class Solution {
    public int[] twoSum(int[] nums, int target) {

        //initialization of hashmap
        HashMap<Integer,Integer> ans=new HashMap<>();
        int n=nums.length;

        for(int i=0; i<n; i++){
            int complement=target-nums[i];

            if(ans.containsKey(complement)){                 //if complement already exist return (index1;index2)
                return new int[]{ans.get(complement),i};
            }else{
                ans.put(nums[i],i);                          //or else put current value with there index in hashmap
            }
        }
        return new int[]{};
    }
}

/*class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> ans = new HashMap<>();

        int i = 0;

        for (int num : nums) {

            int complement = target - num;

            if (ans.containsKey(complement)) {
                return new int[]{ans.get(complement), i};
            }else{
                ans.put(num, i);
            }

            i++;
        }

        return new int[]{};
    }
}*/