// Problem: Rotate Array (Left and Right Rotation using Reverse Method)

// Description:
// Given an array and an integer k, rotate the array either left or right by k positions.

// Approach:
// - Use reverse method to swap elements in a range
// - Left rotation:
//   1. Reverse first k elements
//   2. Reverse remaining elements
//   3. Reverse whole array
// - Right rotation:
//   1. Reverse whole array
//   2. Reverse first k elements
//   3. Reverse remaining elements
// - Handle k using k % n to avoid extra rotations

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void reverse(int[] nums, int start , int end) {
        
        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
        public void rotateLeft(int[] nums , int k){
            int n = nums.length;
            k=k%n;
            reverse(nums , 0,k-1);
            reverse(nums , k,n-1);
            reverse(nums , 0,n-1);
        }
         public void rotateRight(int[] nums , int k){
            int n = nums.length;
            k=k%n;
            reverse(nums , 0,n-1);
            reverse(nums , 0,k-1);
            reverse(nums , k,n-1);
        }
        public void rotate(int[] nums, int k) {
            rotateRight(nums,k);
        }
