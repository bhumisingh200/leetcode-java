class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        //Initialiing for in-place 
        int i=0;

        for(int j=0; j<n; j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}