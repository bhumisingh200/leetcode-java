/*Array*/
class Solution{
    public boolean isIsomorphic(String s, String t){

        //Check if the length is equal of both the string
        if(s.length()!=t.length()){
            return false;
        }

        ////Array must be writen outside the loop as it will be recreated at each looping and previous info will be erased
        int[] mapS=new int[256];
        int[] mapT=new int[256];

        for(int i=0; i<s.length(); i++){

            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            if(mapS[ch1]!=mapT[ch2]){
                return false;
            }

            mapS[ch1]=i+1;             //here the comparison is done by increasing and comparing there index
            mapT[ch2]=i+1;
        }
        return true;
    }
}

//HashMap
/*class Solution{
    public boolean isIsomorphic(String s, String t){

        //Check if the length is equal of both the string
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Character> MapST=new HashMap<>();    //HashMap must be writen outside the loop as it will be recreated at each looping and previous info will be erased
        HashMap<Character,Character> MapTS=new HashMap<>();

        for(int i=0; i<s.length(); i++){

            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            //check if mapS to T
            if(MapST.containsKey(ch1)){
                if(MapST.get(ch1)!=ch2){   //get is used to call the value of ch1
                    return false;
                }
            }else{
                MapST.put(ch1,ch2);
            }
            //check if mapT to S
            if(MapTS.containsKey(ch2)){
                if(MapTS.get(ch2)!=ch1){   //get is used to call the value of ch2
                    return false;
                }
            }else{
                MapST.put(ch2,ch1);
            }
        }
        return true;
    }
}*/