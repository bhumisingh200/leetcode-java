class Solution {
    public int firstUniqChar(String s) {

        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        // First loop: count frequency
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Second loop: find first unique character
        for (int i = 0; i < n; i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}