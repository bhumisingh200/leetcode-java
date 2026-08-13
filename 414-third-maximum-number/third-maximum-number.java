class Solution {
    public int thirdMax(int[] nums) {

        Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {

            // Case 1: duplicate
            if ((first != null && num == first) ||
                (second != null && num == second) ||
                (third != null && num == third)) {
                continue;
            }

            // Case 2: bigger than first
            if (first == null || num > first) {
                third = second;
                second = first;
                first = (long) num;
            }

            // Case 3: between first and second
            else if (second == null || num > second) {
                third = second;
                second = (long) num;
            }

            // Case 4: between second and third
            else if (third == null || num > third) {
                third = (long) num;
            }
        }

        // If third maximum doesn't exist
        if (third == null) {
            return first.intValue();
        }

        return third.intValue();
    }
}