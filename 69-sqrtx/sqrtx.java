class Solution{
    public int mySqrt(int x){
        if(x==0){               //As 0 root will be 0 and while checking low starts from 1 and not 0
            return 0;
        }

        int low=1;
        int high=x;                   //high x bcs above this sqrt will never exist
        while(low<=high){             //Because when low == high there is still one element left to check.

            long mid=low+(high-low)/2;

            if(mid*mid==x){
                return (int) mid;       //int bcs return must be int and not long
            }else if(mid*mid>x){
                high= (int) mid-1;
            }else{
                low= (int) mid +1;
            }
        }
        return high;                          //As low will be more then x value^2 thats why low
    }
}