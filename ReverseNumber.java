/*
Problem : Reverse Integer
Platform: LeetCode
Link: https://leetcode.com/problems/reverse-integer/
Difficulty: Medium

Description:
Reverse the digits of an integer.
Return 0 if it overflows 32-bit range.

Approach:
- Take last digit using %10
- Add it to result by multiplying previous result by 10
- Keep track of sign for negative numbers
- Check overflow before updating result

Time Complexity: O(digits)
Space Complexity: O(1)
*/

class Solution {
    public int reverse(int x) {
        int rev = 0;
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);
        while(x>0){
            int lastDigit = x%10;
            if(rev > (Integer.MAX_VALUE - lastDigit)/10) return 0;
            rev = (rev*10)+lastDigit;
            x = x/10;
        }
        rev = rev * sign;
        return rev;
    }
}