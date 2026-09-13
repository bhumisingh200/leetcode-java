class Solution {
    public int maxArea(int[] height) {

        int n=height.length;
        int maxArea=0;
        int i=0;
        int j=n-1;
        
        while(i<j){

            //Calculate the area
            int area=(j-i)*(Math.min(height[i],height[j]));

            //Check maxArea with area
            if(maxArea<area){
                maxArea=area;
            }

            //Move the min pointer
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}
//Time:O(n) & Space:O(1)