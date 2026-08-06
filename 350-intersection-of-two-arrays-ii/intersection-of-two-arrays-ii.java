//HashMap
class Solution{
    public int[] intersect(int[] nums1, int[] nums2){
        //Initiate HashMap
        HashMap<Integer,Integer> map=new HashMap<>();
        // to store frequency
        for(int num:nums1){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        //Initiating ArrayList
        ArrayList<Integer> list=new ArrayList<>();
        //Traverse nums2
        for(int num:nums2){
            if(map.containsKey(num) && map.get(num)>0){
                list.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        //Convert ArrayList to int[]
        int[] result=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i]=list.get(i);
        }
        return result;
    }
}
//Sorting+Two Pointer
/*class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        //Convert all ArrayList to int[]
        int[] result=new int[list.size()];
        for(int k=0; k<list.size(); k++){
            result[k]=list.get(k);
        }
        return result;
    }
}*/