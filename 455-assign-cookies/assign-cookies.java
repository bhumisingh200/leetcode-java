class Solution {
    public int findContentChildren(int[] g, int[] s) {

        //Sort both the array
        Arrays.sort(g);
        Arrays.sort(s);

        //Intialize the pointers
        int i=0;
        int j=0;

        //The Loop
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i;
        
    }
}