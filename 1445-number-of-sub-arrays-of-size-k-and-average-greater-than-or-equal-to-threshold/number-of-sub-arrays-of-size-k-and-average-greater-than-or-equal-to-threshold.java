class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int n=arr.length;

        //1.Calculate sum of first window(first window must be calculated before checking it)
        int sum=0;
        int count=0;
        //Calculate first window
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        //Then Check first window 
        if(sum>=k*threshold){
            count++;
        }

        //2.Slide the Window
        for(int i=k; i<n; i++){
            //Remove the element leaving the window
            sum-=arr[i-k];

            //Add the new element entering the window
            sum+=arr[i];

            if(sum>=k*threshold){
                count++;
            }
        }
        return count;
    }
}