// Check if Array Is Sorted and Rotated

// Check whether the array is non-decreasing and can become sorted by rotating.

// Approach:
// Count the number of places where order breaks (nums[i] > nums[i+1], circular check included).  
// If breaks ≤ 1, return true else false.

// Time: O(n)
// Space: O(1)

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0; 
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }
        if(count<=1) return true;
        else return false;
    }
}


