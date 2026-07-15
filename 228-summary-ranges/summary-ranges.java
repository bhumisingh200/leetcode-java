class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        int n=nums.length;

        for(int i=0; i<n; i++){
            int start=nums[i];
            while(i<n-1 && nums[i+1]==nums[i]+1){   // length count 5 but index exist 4 only && next index==current index+1 
                i++;
            }
            if(start==nums[i]){
                ans.add(String.valueOf(start));
            }else{
                ans.add(start+"->"+nums[i]);
            }
        }
        return ans;
        
    }
}