class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0){
            return true;
        }

        int low=1;
        int high=num;

        while(low<=high){
            int mid=low+(high-low)/2;
            long square= (long) mid*mid;//// Use long to prevent integer overflow when calculating mid * mid.
            if(square==num){
                return true;
            }else if(square>num){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;                   //If did not found any perfect square then false
    }
}