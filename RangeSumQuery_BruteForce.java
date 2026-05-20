/*
Problem: Range Sum Query – Immutable

Given an integer array nums, handle multiple queries to find the sum 
between indices left and right (inclusive).

Approach:
Brute force – iterate from left to right for each query.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class NumArray {
    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i = left; i <= right; i++){
            sum += nums[i];
        }
        return sum;
    }
}
