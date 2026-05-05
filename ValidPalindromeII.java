 /*
Problem: 680. Valid Palindrome II

Check if string can become a palindrome after deleting at most one character.

Approach:
- Two pointers (left, right)
- On mismatch, try skipping left or right character
- Validate remaining substring

Time: O(n)
Space: O(1)
*/ 

class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return CP(s,left+1,right) || CP(s,left,right-1);
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
        private boolean CP(String s, int left , int right){
            while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
            }
            return true;
        }
    }
