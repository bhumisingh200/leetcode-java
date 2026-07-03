class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int i=0;
        int j=n-1;
        int k=n-1;

        while(i<=j){
            int leftsqr=nums[i] * nums[i];
            int rightsqr=nums[j] * nums[j];

            if(leftsqr>rightsqr){
                ans[k]=leftsqr;
                i++;                            
                k--;
            }else{
                ans[k]=rightsqr;
                j--;
                k--;             
            }
        }
        return ans;
    }
}
/*To kya O(1) space complexity possible hai?

Yahi interesting baat hai.

Agar interviewer bole:

"Without extra array, O(1) space me karo."

To generally answer hoga:

Is two-pointer approach ke saath safely O(1) space possible nahi hai, kyunki result likhte waqt original values overwrite ho jaati hain jinhe hume baad ki comparisons ke liye chahiye.

LeetCode bhi isi reason se new array (O(n) space) wala solution expect karta hai*/