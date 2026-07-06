class Solution {
    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

       //loop works until i smaller then j index
        while (i < j) {
            //checking if i is a ASCII character
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            //checking if j is a ASCII character
            else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            //if index i and j character equal or not by converting it first into lower case
            else {

                if (Character.toLowerCase(s.charAt(i))
                        != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }

                i++;
                j--;
            }
        }

        return true;
    }
}