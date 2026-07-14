class Solution {
    public char findTheDifference(String s, String t) {
        
        char ans=0;

        for(char ch : s.toCharArray()){
            ans^=ch;
        }

        for(char ch : t.toCharArray()){
            ans^=ch;
        }
        return ans;
    }
}
/*Array
class Solution {
    public char findTheDifference(String s, String t) {

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 'a';

            if (freq[index] == 0) {
                return t.charAt(i);
            }

            freq[index]--;
        }

        return ' ';
    }
}*/
/*HashMap
class Solution {
    public char findTheDifference(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return ch;
            }

            map.put(ch, map.get(ch) - 1);
        }

        return ' ';
    }
}aq*/
