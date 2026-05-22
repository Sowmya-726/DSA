// # Longest Common Prefix (Java)

// ## Problem
// Find the longest common prefix string amongst an array of strings.

// ## Approach
// - Sort the array lexicographically
// - Compare first and last string
// - Find common prefix character by character

// ## Complexity
// - Time: O(n log n * m)
// - Space: O(1)

// ## Key Idea
// After sorting, the common prefix of the entire array is the same as the common prefix of the first and last string.

class Solution {
    public String longestCommonPrefix(String[] strs) {
       StringBuilder result = new StringBuilder();
       Arrays.sort(strs);
       char [] first = strs[0].toCharArray();
       char [] last = strs[strs.length-1].toCharArray();

       for(int i=0;i<first.length;i++){
        if(i<last.length && first[i]==last[i]){
            result.append(first[i]);
        }
        else{
            break;
        }
       }
       return result.toString();
    }
}