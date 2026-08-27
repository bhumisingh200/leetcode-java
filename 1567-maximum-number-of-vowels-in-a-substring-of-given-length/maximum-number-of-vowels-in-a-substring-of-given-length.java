class Solution {
    public int maxVowels(String s, int k) {

        int n=s.length();
        int count =0;
        int maxVowel=0;

        for(int i=0; i<k; i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
        }
        maxVowel=count;

        //Slide the window
        for(int i=k; i<n; i++){
            //Remove leaving characters
            if(isVowel(s.charAt(i-k))){
                count--;
            }

            //Add entering window character
            if(isVowel(s.charAt(i))){
                count++;
            }

            maxVowel=Math.max(maxVowel,count);
        }
        return maxVowel;
    }

    private boolean isVowel(char ch){
        return ch=='a' || ch=='e'  || ch=='u' || ch=='i' || ch=='o';
    }
}