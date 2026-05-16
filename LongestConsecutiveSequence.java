// Description:
// Given an array of integers, find the length of the longest
// consecutive sequence present in the array.

// Approach:
// - Store all elements in a HashSet for fast lookup
// - Traverse the array
// - Check if current element is the starting element
//   of a sequence using:
//      !set.contains(arr[i] - 1)
// - If it is the starting element:
//      keep checking consecutive elements
//      using while(set.contains(current + 1))
// - Count sequence length and update longest answer

// Time Complexity: O(n)
// Space Complexity: O(n)



import java.util.HashSet;
class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        // int longest = 1;
        // Arrays.sort(arr);
        // int n = arr.length;
        // int lastSmallNumber = Integer.MIN_VALUE;
        // int cnt =0;
        // for(int i=0;i<n;i++ ){
        //     if(arr[i]-1==lastSmallNumber){
        //         cnt = cnt+1;
        //         lastSmallNumber = arr[i];
        //     }
        //     else if(arr[i]!=lastSmallNumber){
        //         cnt = 1;
        //         lastSmallNumber = arr[i];
        //     }
        //     longest = Math.max(longest,cnt);
        // }
        // return longest;
        
        
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int longest = -1;
        for(int i=0;i<n;i++){
            if(!set.contains(arr[i]-1)){
                int curEle = arr[i];
                int cnt = 1;
                
                while(set.contains(curEle+1)){
                    cnt = cnt+1;
                    curEle = curEle+1;
                }
                longest = Math.max(longest,cnt);
            }
           
        }
        return longest;
        
        
    }
}