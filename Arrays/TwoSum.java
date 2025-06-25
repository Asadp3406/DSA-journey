class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n = nums.length;
        if(n < 2) return null;
        for(int i = 1; i<n; i++) {
            
            for(int j = i; j<n; j++) {
                if( (nums[j] + nums[j-i]) == target) {
                    return new int[]{j, j-i};
                }
            }
        }
        return null;
    }
}

Added Two Sum solution in Arrays folder
