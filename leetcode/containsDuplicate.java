//Checking if an integer array nums contains any duplicates using HashSet concept. If duplicated are present, true is returned else false is returned.
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i< nums.length; i++){
            if(set.contains(nums[i]))
                return true;
        }
        return false;
    }
}