class Solution {
    public boolean backspaceCompare(String s, String t) {

        int i=s.length()-1;
        int j=t.length()-1;

        int skipS=0;
        int skipT=0;

        while( i>=0 || j>=0){

            //Process s
            while(i>=0){
                if(s.charAt(i)=='#'){
                    skipS++;
                    i--;
                }else if(skipS>0){
                    skipS--;
                    i--;
                }else{
                    break;
                }
            }

            //Process t
            while(j>=0){
                if(t.charAt(j)=='#'){
                    skipT++;
                    j--;
                }else if(skipT>0){
                    skipT--;
                    j--;
                }else{
                    break;
                }
            }

            //compare atual character
            if( i>=0 && j>=0){                   //Only compare characters if BOTH strings still have a character."
                if(s.charAt(i)!=t.charAt(j)){
                    return false;
                }
            }

            //If string are unequal
            if((i>=0)!=(j>=0)){
                return false;
            }

            i--;
            j--;
        }
        return true;
    }
}