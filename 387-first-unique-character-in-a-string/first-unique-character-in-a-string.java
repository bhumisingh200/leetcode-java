class Solution {
    public int firstUniqChar(String s) {

        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();

        //First Loop:Store all character frequency
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        //Second Loop:Check first element having frequency 1
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            if(map.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
}