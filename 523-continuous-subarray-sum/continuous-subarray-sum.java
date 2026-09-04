class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();

        //Remainder 0 is considered at -1 index
        map.put(0,-1);
        int sum=0;

        for(int i=0; i<nums.length; i++){
            sum+=nums[i];

            int remainder=sum % k;

            if (map.containsKey(remainder)) {
                if (i - map.get(remainder) >= 2) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }
        return false;
    }
}