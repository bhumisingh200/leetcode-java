/*class Solution{
    public int countGoodSubstrings(String s){

        int n=s.length();
        int unique=0;

        //Edge Case
        if(n<3){
            return 0;
        }

        //Current Window
        if(s.charAt(0)!=s.charAt(1) &&
           s.charAt(0)!=s.charAt(2) &&
           s.charAt(1)!=s.charAt(2)){
            unique++;
        }

        //Sliding Window
        for(int i=3; i<n; i++){
            if(s.charAt(i)!=s.charAt(i-1) &&
               s.charAt(i)!=s.charAt(i-2) &&
               s.charAt(i-1)!=s.charAt(i-2)){
                unique++;
            }
        }
        return unique;
    }
}*/

//Different Method
class Solution{
    public int countGoodSubstrings(String s){

        int n=s.length();
        int unique=0;

        //Edge Case
        if(n<3){
            return 0;
        }

        for(int i=0; i<=n-3; i++){
            if(s.charAt(i)!=s.charAt(i+1) &&
               s.charAt(i)!=s.charAt(i+2) &&
               s.charAt(i+1)!=s.charAt(i+2)){
                unique++;
            }
        }
        return unique;
    }
}