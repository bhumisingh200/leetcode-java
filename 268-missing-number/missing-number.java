class Solution {
    public int missingNumber(int[] nums) {

       int xor=nums.length;  //that is why stored it first and the starting the loop of "<"
        for(int i=0; i<nums.length; i++){
            xor^=i;
            xor^=nums[i];   //this will not accept "<="" index(Index not found error)
        }
        return xor;
    }
}

/*HashSet
    HashSet<Integer> set=new HashSet<>();

        for(int num:nums){
            set.add(num);
        }
        for(int i=0; i<=nums.length; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}*/

/*Sum
       int expected=nums.length*(nums.length+1)/2;
       
       int actual=0;
       for(int num:nums){
        actual+=num;
       }
       return expected-actual;
    }
}*/