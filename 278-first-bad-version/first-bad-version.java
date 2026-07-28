/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int low=1;
        int high=n;

        while(low<high){            //if position  5 is equal to low and high both there is no need to   again compare low=high as it is the only final answer
            int mid=low+(high-low)/2;
            boolean ans=isBadVersion(mid);

            if(ans==false){
                low= mid+1;
            }else{
                high=mid;          //as we don't know that mid version is the only first bad version
            }
        }
        return low;                //As we wanted to find the lowest bad version
        
    }
}