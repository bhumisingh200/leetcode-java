class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxArea=0;
        int i=0;
        int j=n-1;
        while(i<j){
            int area=(j-i)*(Math.min(height[i],height[j]));
            if(maxArea<area){
                maxArea=area;
            }
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}