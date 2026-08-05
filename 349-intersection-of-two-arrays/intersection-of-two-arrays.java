class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> answer=new HashSet<>();
        
         
        // Store all elements of nums1 in HashMap
        for(int num:nums1){ 
            set1.add(num);
        }
        // Check common elements
        for(int i=0; i<nums2.length;i++){ 
            if(set1.contains(nums2[i])){ 
                answer.add(nums2[i]); 
            } 
        }

        // Convert HashSet to int[]
        int[] result=new int[answer.size()];    //writing both line down because up near hashset declaration answer.size() is still 0 
        int index=0;
        for(int num:answer){
            result[index++]=num;
        }

        return result;
        
    }
}
//Time Complexity: O(n+m)
//Space Complexity: O(n)