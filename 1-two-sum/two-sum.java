class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> ans = new HashMap<>();

        int i = 0;

        for (int num : nums) {

            int complement = target - num;

            if (ans.containsKey(complement)) {
                return new int[]{ans.get(complement), i};
            }

            ans.put(num, i);

            i++;
        }

        return new int[]{};
    }
}