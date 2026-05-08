// Problem: Rotate Array by One

// Description:
// Given an array, rotate it to the right by one position.

// Approach:
// - Store the last element
// - Shift all elements one position to the right
// - Place the last element at the first index

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void rotate(int[] arr) {
        // code here
        int n = arr.length;
        int temp = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
}