class Solution {
    public int totalFruit(int[] fruits) {

        int left=0;
        int right=0;
        int maxf=0;
        int n=fruits.length;
        HashMap<Integer,Integer> map=new HashMap<>(2);

        while(right<n){

            //Add fruit entering the window
            int ch=fruits[right];
            map.put(ch,map.getOrDefault(ch,0)+1);   //(manages both the conditions)fruit already exists → increase count 
                                                    //new fruit → add with count 1
            right++;

            //More then 2 fruit -> shrink window
            while(map.size()>2){
                int fruit=fruits[left];
                map.put(fruit, map.get(fruit)-1);

                if(map.get(fruit)==0){
                    map.remove(fruit);
                }
                 left++;
            }
           

            //Current window is valid
            int length=right-left;
            maxf=Math.max(maxf,length);
        }
        return maxf;
    }
}