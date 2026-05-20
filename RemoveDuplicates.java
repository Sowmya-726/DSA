
// Problem: Remove Duplicates from Sorted Array (LeetCode 26)

// Description:
// Given a sorted array, remove duplicates in-place such that each element appears only once and return the new length.

// Approach:
// - Use two pointers (i, j)
// - i tracks position of unique elements
// - j scans the array
// - If nums[j] != nums[i], move i forward and update nums[i]

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0;i<n;i++){
        //     set.add(nums[i]);
        // }
        // Integer[] unique = set.toArray(new Integer[0]);
        // for(int j=0;j<unique.length;j++){
        //     nums[j]=unique[j];

        //     }
        //     return unique.length;
            int i=0;
            for(int j=1;j<n;j++){
                if(nums[j]!=nums[i]){
                    nums[i+1]=nums[j];
                    i++;
                }
            }
            return i+1;
        }
            }

