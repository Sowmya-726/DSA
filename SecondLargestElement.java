/*
Problem: Second Largest Element in Array

Description:
Find the second largest distinct element in the array. If it does not exist, return -1.

Approach:
- Sort the array
- Traverse from second last index
- Skip duplicates of largest element
- Return first smaller distinct value

Time: O(n log n)
Space: O(1)
*/


class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        // int largest = -1;
        // int secondLargest = -1;
        
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>largest){
        //         secondLargest = largest;
        //         largest = arr[i];
        //     }
        //      else if (arr[i]>secondLargest && arr[i]<largest){
        //         secondLargest = arr[i];
        //      }
        // }
        // return secondLargest;
        
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
}