/*
Problem: Valid Palindrome

Description:
Check if string is a palindrome after removing non-alphanumeric characters and ignoring case.

Approach:
- Two pointers (left, right)
- Skip non-alphanumeric chars
- Compare lowercase characters

Time: O(n)
Space: O(1)
*/

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                str.append(Character.toLowerCase(ch));
            }
        }
        return CP(str.toString());
    }
    private boolean CP(String s){
        int left =0;
        int right = s.length()-1;
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