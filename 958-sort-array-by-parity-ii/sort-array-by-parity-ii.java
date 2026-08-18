class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int i=0; //even indexes
        int j=1; //odd indexes

        while(i<nums.length && j<nums.length){   //i<nums.length = i<=nums.length-1

            //Find wrong even index
           while (i<nums.length && nums[i] % 2 == 0){
                i += 2;
            }

            //Find wrong odd index
            while (j<nums.length && nums[j] % 2 != 0) {  //or 2==1
                j += 2;
            }

            //Swap
            if(i<nums.length && j<nums.length){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;    
            }
        }
        return nums;
    }
}