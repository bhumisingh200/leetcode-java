class Solution {
    public int removeElement(int[] nums, int val) {

        int i=0;                   //it is used differently as i is used to store the only element which is not val

        for(int j=0; j<nums.length; j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}