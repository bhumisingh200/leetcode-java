class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int maxlength=0;
        int n=s.length();

        int[] freq=new int[128];

        while(right<n){

            //Expand
            int add=s.charAt(right);
            freq[add]++;
            right++;

            while(freq[add]>1){

                //Shrink
                int remove=s.charAt(left);
                freq[remove]--;
                left++;
            }   
            maxlength=Math.max(maxlength,right-left);
        }
        return maxlength;
    }
}