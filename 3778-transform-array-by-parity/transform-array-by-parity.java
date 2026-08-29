//O(n logn) 
/*class Solution {
    public int[] transformArray(int[] nums) {

        for(int i=0; i<nums.length; i++ ){
            if(nums[i]%2==0){
                nums[i]=0;
            }else{
                nums[i]=1;
            }
        } 
        Arrays.sort(nums);   //O(n log n)
        return nums;
        
    }
}*/

//O(n)  count even 
class Solution{
    public int[] transformArray(int[] nums){

        int even=0;

        for(int num:nums){
            if(num%2==0){
                even++;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(i<even){
                nums[i]=0;
            }else{
                nums[i]=1;
            }
        }
        return nums;
    }
}