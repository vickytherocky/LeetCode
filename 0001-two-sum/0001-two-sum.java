class Solution {
    int[] ans;
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            // Check each other element that comes after it
            for (int j = i + 1; j < nums.length; j++) {
                // If the two elements add up to the target, return their indices
                if (nums[i] + nums[j] == target) {
                    arr[count++]=i;
                    arr[count]=j;
                }
            }
        }
        // If no pair is found, return empty (though the problem says there will always be one solution)
        return  arr;
        
        
    }
}