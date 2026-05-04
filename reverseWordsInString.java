/*
Problem: Reverse Words in a String

Description:
Given a string s, reverse the order of words. Words may have multiple spaces, but output should have single spaces only.

Approach:
- Trim string
- Split using "\\s+"
- Traverse from end and build result

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String reverseWords(String s) {
    //     String[] words = s.trim().split("\\s+");
    //     String result = "";
    //     for(int i=words.length -1;i>=0;i--){
    //         result = result+words[i];
    //         if(i!=0){
    //             result = result+ " ";
    //         }
    //     }
    // return result;

    String[] words = s.split("\\s+");
    StringBuilder result = new StringBuilder();
    for(int i=words.length-1;i>=0;i--){
        result.append(words[i]).append(" ");
    }
    String str = result.toString().trim();
    return str;
    }
}
