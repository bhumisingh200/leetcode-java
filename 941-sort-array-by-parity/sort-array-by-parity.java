class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int i=0;
        int j=nums.length-1;

        while(i<j){

            //Do i++ until it find odd
            while(i<j && nums[i]%2==0){
                i++;
            }

            //Do j-- until it find even
            while(i<j && nums[j]%2!=0){
                j--;
            }

            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        return nums;
    }
}