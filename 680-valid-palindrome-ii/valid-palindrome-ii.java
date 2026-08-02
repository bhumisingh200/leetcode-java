class Solution {
    public boolean validPalindrome(String s) {

        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return isPalindrome(s,i+1,j)||isPalindrome(s,i,j-1);  //plus left||minus right
            }
        }
        return true;
    }

    //A function to check left and right 
    private boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
/*Q)Can you optimize this?"
Ans)No. This solution is already optimal with O(n) time and O(1) extra space. The helper function does not increase the asymptotic complexity because it only checks the remaining substring after the first mismatch.*/