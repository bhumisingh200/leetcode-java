class Solution{
    public boolean isAnagram(String s, String t){

        if(s.length()!=t.length()){
            return false;
        }

        int[] freq=new int[26];

        //Count character from s
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        //Remove Characters from t
        for(int i=0; i<t.length();i++){
            freq[t.charAt(i)-'a']--;

            if(freq[t.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;
    }
}
/*class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of s
        for(int i=0 ; i<s.length(); i++){
            char ch=s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
            }else{
                map.put(ch,1);            }
        }
        

        // Traverse t
        for(int i=0; i<t.length(); i++){
            char ch=t.charAt(i);

            if(!map.containsKey(ch)||map.get(ch)==0){
                return false;
            }
        }
        return true;
    }
}*/

//If unicode then use HASHMAP (but will be used in most)
//If not then use ARRAY(Best Option)but limited only to some q use

/*Why did you use HashMap instead of an array?
Because HashMap works for any character set, whereas a frequency array of size 26 only works when the input is restricted to lowercase English letters.*/