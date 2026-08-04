class Solution {
    public int maxArea(int[] height) {
        
        int n=height.length;
        int maxArea=0;
        int i=0;
        int j=n-1;

        while(i<j){
            //Calculating the area
            int area=(j-i)*(Math.min(height[i],height[j]));

            //Find the maxArea
            if(maxArea<area){
                maxArea=area;
            }

            //Moving pointer only if any 1 of the height is shorter
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}