class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int maxlength=0;
        int n=s.length();

        int[] freq=new int[128];

        while(right<n){

            //Expand
            int add=s.charAt(right);
            freq[add]++;
            right++;

            while(freq[add]>1){

                //Shrink
                int remove=s.charAt(left);
                freq[remove]--;
                left++;
            }   
            maxlength=Math.max(maxlength,right-left);
        }
        return maxlength;
    }
}

/*class Solution{
    public int lengthOfLongestSubstring(String s){

        int left=0;
        int right=0;
        int n=s.length();
        int maxlength=0;
        HashMap<Character,Integer> map=new HashMap<>();

        while(right<n){
            //Expand
            char add=s.charAt(right);
            map.put(add,map.getOrDefault(add,0)+1);
            right++;

            while(map.get(s.charAt(right-1))>1){
                //Shrink
                char remove=s.charAt(left);
                map.put(remove,map.get(remove)-1);
                left++;
            }
            maxlength=Math.max(maxlength,right-left);
        }
        return maxlength;
    }
}*/