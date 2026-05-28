/* This code uses Brute Force technique to input an array int[] nums, and an integer target. We find the indexes of the two numbers from the array which add up to give the target */
class TwoSum{
    public int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(target == nums[i] + nums[j]){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}