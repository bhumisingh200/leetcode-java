class NumArray {

    //Initializes an array called prifix outside such that it should be accessed by sumRange as well
    int[] prifix;

    public NumArray(int[] nums) {
        //Local initialization
        prifix=new int[nums.length+1]; 

        for(int i=0; i<nums.length; i++){
            prifix[i+1]=prifix[i]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return prifix[right+1] - prifix[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */