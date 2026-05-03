/*
Problem: Reverse String

Description:
Given a character array s, reverse the array in-place.

Approach:
Use two pointers (left and right) and swap characters until they meet.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}