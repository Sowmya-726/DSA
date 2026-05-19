/*
Problem: Longest Substring Without Repeating Characters

Description:
Find the length of the longest substring without repeating characters.

Approach:
- Use sliding window with two pointers (left, right)
- Use a HashSet to track characters in current window
- If duplicate found, move left pointer until duplicate is removed
- Track maximum length

Time: O(n)
Space: O(n)
*/


class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1 || s.length()==0){
            return s.length();
        }
        HashSet<Character> seen = new HashSet<>();
        int left = 0;
        int maxlength = 0;

        for(int right =0;right<s.length();right++){
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            maxlength = Math.max(maxlength , right-left+1);
        }
        return maxlength;
    }
}