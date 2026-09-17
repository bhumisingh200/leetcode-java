class Solution {
    public int characterReplacement(String s, int k) {

        int left=0;
        int right=0;
        int ans=0;
        int maxFreq=0;

        int[] freq=new int[26];
        
        while(right<s.length()){

            //Expand and store the freq
            int index=s.charAt(right)-'A';
            freq[index]++;
            right++;

            //Find Maxfreq
            maxFreq=Math.max(maxFreq,freq[index]);

            while(right-left-maxFreq>k){

                //Remove
                int removeIndex=s.charAt(left)-'A';
                freq[removeIndex]--;
                left++;
            }
            ans=Math.max(ans,right-left);
        }
        return ans;
    }
}