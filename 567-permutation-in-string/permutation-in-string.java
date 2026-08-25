class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int left = 0;
        int k = s1.length();
        int right = k;
        int n = s2.length();

        //Edge Case
        if(k > n){
            return false;
        }

        HashMap<Character,Integer> map1=new HashMap<>();    //frequency of characters in s1
        HashMap<Character,Integer> map2=new HashMap<>();    //frequency of characters in current window of s2

        //map1 → frequency of s1
        for(int i = 0; i < k; i++) {                       
            char ch1 = s1.charAt(i); 
            map1.put(ch1, map1.getOrDefault(ch1, 0) + 1); 
            char ch2 = s2.charAt(i);
            map2.put(ch2, map2.getOrDefault(ch2, 0) + 1);
        }

        //map2 → frequency of first window of s2
        /*for(int i = 0; i < k; i++) {                       
            char ch = s2.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }*/

        //Check first window
        if(map1.equals(map2)){
            return true;
        }

        while(right<s2.length()){
            //Slide the window & removing the element
            char remove=s2.charAt(left);
            map2.put(remove,map2.get(remove)-1);
            if(map2.get(remove)==0){
                map2.remove(remove);
            }

            //Add character entering the window
            char add=s2.charAt(right);
            map2.put(add,map2.getOrDefault(add,0)+1);

            //Check current window
            if(map1.equals(map2)) {
                return true;
            }
            
            right++;
            left++;

        }
        return false;
    }
}
            
            