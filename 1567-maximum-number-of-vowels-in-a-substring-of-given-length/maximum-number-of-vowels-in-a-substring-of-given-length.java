class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int count=0;
        int maxVowel=0;

        //First Window
        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }

        maxVowel=count;

        //Slide the window
        for(int i=k; i<n; i++){
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            if(isVowel(s.charAt(i))){
                count++;
            }

            maxVowel=Math.max(maxVowel,count);
        }
        return maxVowel;
    }

    private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i'  ||
               c=='o' || c=='u';
    }
}