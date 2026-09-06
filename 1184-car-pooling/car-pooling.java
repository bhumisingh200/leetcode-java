class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        int[] diff=new int[1000+1];

        //1.Fetch required value fromm array
        for(int[] trip:trips){
            int numPassengers=trip[0];
            int from=trip[1];
            int to=trip[2];

            //Add passenger at first index & subtract at last+1 index
            diff[from]+=numPassengers;    //If you do:diff[from - 1] += passengers;then:from = 1,from - 1 = 0 ,passengers get on at stop 0 which is wrong.
            diff[to]-=numPassengers;
        }
        int current=0;

        //Now do the prefix sum
        for(int i=0; i<1001; i++){
            current+=diff[i];

            if(current>capacity){
                return false;
            }
        }
        return true;
    }
}