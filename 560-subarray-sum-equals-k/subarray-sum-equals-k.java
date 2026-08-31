class Solution {
    public int subarraySum(int[] nums, int k) {

       HashMap<Integer,Integer> map=new HashMap<>();

        //Prefix sum 0 has occured once
        map.put(0,1);

        int prefixsum=0;
        int count=0;

        for(int i=0; i<nums.length; i++){
            //Calculate current prefix sum
            prefixsum+=nums[i];

            //Check if previous prefix sum exists
            if(map.containsKey(prefixsum-k)){
                count+=map.get(prefixsum-k);
            }

            //Store current prefix sum
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}

//Space complexity: O(n)
//Time complexiy: O(n)