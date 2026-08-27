class Solution{
    public boolean checkInclusion(String s1, String s2){

        int left=0;
        int k=s1.length();
        int right=k;
        int n=s2.length();

        //Edge case
        if(k>n){
            return false;
        }

        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        //Enter s1 char in map1
        for(int i=0; i<k; i++){
            char ch=s1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        //Enter s2 char in map2
        for(int i=0; i<k; i++){
            char ch=s2.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        //Check current window
        if(map1.equals(map2)){
            return true;
        }

        //Slide the s2 window
        while(right<n){

            //Remove left character
            char remove=s2.charAt(left);
            map2.put(remove , map2.get(remove)-1);

            if(map2.get(remove)==0){
                map2.remove(remove);
            }
            left++;

            //Add right character
            char add=s2.charAt(right);
            map2.put(add, map2.getOrDefault(add, 0)+1);
            right++;

            //Check each slided window
            if(map1.equals(map2)){
                return true;
            }
        }
        return false;
    }
}