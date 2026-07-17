/*class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;
        int n=s.length();
        int m=t.length();

        while (i<s.length() && j<t.length()) { 

            if (s.charAt(i)==t.charAt(j)) { 
                i++; 
                j++; 
            } else {
                j++; 
            }
        }
        return i==s.length(); 
    }
}*/

//or for less code but same logic
class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0;

        for (int j = 0; j < t.length() && i < s.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }

        return i == s.length();
    }
}
