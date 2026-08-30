class Solution{
    public int pivotIndex(int[] nums){
        
        //1.Calculate total sum
        int total=0;
        for(int num:nums){
            total+=num;
        }

        //2.Now subtract current element with left element from total to find right element
        int rightside=0;
        for(int i=0; i<nums.length; i++){
            int leftside=total-rightside-nums[i];

            if(rightside==leftside){
                return i;
            }
            rightside+=nums[i];
        }
        return -1;

    }
}