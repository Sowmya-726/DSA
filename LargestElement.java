/*
Problem : Largest Element
Platform: Coding Practice

Description:
Find the maximum element in the given array.

Approach:
- Initialize a variable with first element
- Traverse the array
- Update if a larger element is found

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public static int largest(int[] arr) {
        code here
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                max = Math.max(arr[i],max);
            }
        }
        return max;
        
        // int n = arr.length;
        // Arrays.sort(arr);
        // return arr[n-1];
    }
}
