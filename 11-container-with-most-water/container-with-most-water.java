class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxArea=0;
        int i=0;
        int j=n-1;
        while(i<j){
            //Calculation of Area
            int area=(j-i)*(Math.min(height[i],height[j]));//weight*height
            //Store maximum area only
            if(maxArea<area){
                maxArea=area;
            }
            //MOve pointer only if any one of the line is shorter
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}