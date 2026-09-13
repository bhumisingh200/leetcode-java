class Solution{
    public String longestCommonPrefix(String[] strs){

        //Check if string exist
        if(strs.length==0){
            return "";
        }

        String prefix=strs[0];
        for(int i=0; i<strs.length; i++){

            //Check longest prefix
            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
            }

            //If empty return empty
            if(prefix.isEmpty()){
                return "";
            }
        }
        return prefix;
    }
}