/*
Problem: First Repeated Character

Description:
Given a string s containing only lowercase letters,
find the first repeated character.

The first repeated character is the character whose
second occurrence appears first in the string.

If no repeated character exists, return "-1".

Example:
Input: s = "geeksforgeeks"
Output: "e"

Explanation:
'e' repeats first at index 2.

Approach:
- Use a frequency array of size 26
- Traverse the string character by character
- If a character is already seen before,
  return it immediately
- Otherwise increment its frequency

Time Complexity: O(n)
Space Complexity: O(1)
*/


class Solution {
    String firstRepChar(String s) {
        // code here
        int n = s.length();
        int [] freq = new int[26];
        
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(freq[ch-'a']>0){
                return Character.toString(ch);
            }
            freq[ch-'a']++;
        }
        
        return "-1";
    }
}