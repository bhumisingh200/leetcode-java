class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int n=arr.length;
        int sum=0;
        int count=0;

        //Calculate Sum in first Window
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        //Now check first window
        if(sum>=k*threshold){
            count++;
        }

        //Slide the window
        for(int i=k; i<n; i++){
            //Subtract leaving element
            sum-=arr[i-k];
            //Add entering element
            sum+=arr[i];

            //Check each window
            if(sum>=k*threshold){
                count++;
            }
        }
        return count;
    }
}