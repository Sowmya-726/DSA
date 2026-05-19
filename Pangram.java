/*
Problem: Check if a String is Pangram

Description:
Given a string sentence containing lowercase English letters,
check whether it is a pangram or not.

A pangram is a sentence that contains every
letter from 'a' to 'z' at least once.

Example:
Input:
sentence = "thequickbrownfoxjumpsoverthelazydog"

Output:
true

Explanation:
The sentence contains all 26 English alphabets.

Approach:
- Use a HashSet to store unique characters
- Traverse the string character by character
- Add lowercase letters into the HashSet
- Duplicate letters are ignored automatically
- If HashSet size becomes 26,
  then all alphabets are present

Time Complexity: O(n)
Space Complexity: O(26)
*/


class Solution {
    public boolean checkIfPangram(String sentence) {
        // boolean [] seen = new boolean[26];
        // int n = sentence.length();
        // for(int i=0;i<n;i++){
        //     char ch = sentence.charAt(i);
        //     if(ch >= 'a' && ch<='z'){
        //         seen[ch-'a']=true;
        //     }
        // }
        // for(int i=0;i<26;i++){
        //     if(seen[i]==false){
        //         return false;
        //     }
        // }
        // return true;

        HashSet<Character> set = new HashSet<>();
        int n = sentence.length();
        for(int i=0;i<n;i++){
            char ch = sentence.charAt(i);
            set.add(ch);
        }
        return set.size()==26;
    }
}