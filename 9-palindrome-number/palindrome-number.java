//Optimal in Asymptotic Complexity
//Time:O(log10 x) Space:O(1)
/*class Solution {
    public boolean isPalindrome(int x) {

        int original=x;
        int remainder;
        int reverse=0;
        
        while(x>0){
            remainder=x%10;
            reverse=(reverse*10)+remainder;
            x=x/10;
        }
        return(original==reverse);
    }
}*/

//Time:O(log n) Space:O(1)
class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int original = x;
        int reverse = 0;

        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        return original == reverse;
    }
}