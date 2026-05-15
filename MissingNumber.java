
Problem: Missing Number (LeetCode 268)

Description:
Given an array containing n distinct numbers in the range [0, n], find the one number that is missing from the array.

Approach:
- Calculate expected sum using formula n*(n+1)/2
- Calculate actual sum of array elements
- Return difference (expected - actual)

Time Complexity: O(n)
Space Complexity: O(1)





class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        // for(int i=0;i<=n;i++){
        //     boolean found = false;
        //     for(int j=0;j<n;j++){
        //         if(nums[j]==i){
        //             found = true;
        //             break;
        //         }
        //     }
        //     if(found == false){
        //         return i;
        //     }
            
        // }
        // return -1;

        int expectedSum = (n*(n+1))/2;
        int originalSum =0;
        for(int i=0;i<n;i++){
            originalSum = originalSum+nums[i];
        }
        return expectedSum-originalSum;
    }
}