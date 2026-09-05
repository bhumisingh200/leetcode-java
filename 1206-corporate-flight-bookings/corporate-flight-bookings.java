class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {

        int[] diff=new int[n+1];
        
        //1. Fetch required values from the array
        for(int[] booking:bookings){
            int first=booking[0];
            int last=booking[1];
            int seats=booking[2];

            //Add seats at first-1 index & ubtract at last index
            diff[first-1]+=seats;
            diff[last]-=seats;
        }

        int[] answer=new int[n];
        int current=0;

        //Now do the prefix sum
        for(int i=0; i<n; i++){
            current+=diff[i];
            answer[i]=current;
        }
        return answer;
    }
}