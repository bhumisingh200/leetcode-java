//HashSet
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

//Sorting+Two Pointer
/*class Solution{
    public int[] intersection(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;

        while(i<nums1.length && j<nums2.length){

            if(nums1[i]==nums2[j]){
                if(list.isEmpty() || list.get(list.size()-1)!= nums1[i]){
                    list.add(nums1[i]);
                }
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        //Convert ArraList to int[]
        int[] result = new int[list.size()];

        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
        
    }
}*/