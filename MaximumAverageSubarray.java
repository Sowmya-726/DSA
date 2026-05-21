/*Problem: Maximum Average Subarray I

Given an integer array nums and an integer k, find a contiguous subarray of length k that has the maximum average value and return it.

Approach:
Use Sliding Window:
- Calculate sum of first k elements
- Slide the window by removing one element and adding the next
- Track maximum sum

Time Complexity: O(n)
Space Complexity: O(1) */

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum=0;
        for(int i=0;i<k;i++){
            
            sum = sum+nums[i];
        }
        int maxSum = sum;

        for(int i=k;i<nums.length;i++){
            sum = sum - nums[i-k] + nums[i];
            maxSum = Math.max(maxSum , sum);
        }
        return (double)maxSum/k;
    }
}