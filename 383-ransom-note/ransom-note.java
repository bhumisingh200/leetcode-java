class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];

        // Count frequency of magazine
        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']++;
        }

        // Use characters for ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';

            if (freq[index] == 0) {
                return false;
            }

            freq[index]--;
        }

        return true;
    }
}
/*class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> count = new HashMap<>();

        // Count frequency of magazine characters
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }

        // Traverse ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            // Character not available or frequency finished
            if (!count.containsKey(ch) || count.get(ch) == 0) {
                return false;
            }

            // Use one occurrence
            count.put(ch, count.get(ch) - 1);
        }

        return true;
    }
}*/