// Problem: Palindrome Number
// A number that reads same forward and backward
// Approach: Reverse number and compare with original
// Time: O(log n) | Space: O(1)


class Solution {
    public boolean isPalindrome(int x) {
       // Negative numbers are not palindrome
        if (x < 0) return false;

        int original = x;
        int reverse = 0;

        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        return original == reverse;  
    }
}