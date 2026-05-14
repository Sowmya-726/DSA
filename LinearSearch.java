// Problem: Linear Search in Array

// Description:
// Given an array and a target value, find the index of the target element. If not found, return -1.

// Approach:
// - Traverse the array from start to end
// - Compare each element with the target
// - Return index if match is found
// - If no match, return -1

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int search(int arr[], int x) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
