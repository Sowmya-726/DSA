/*
Problem: Valid Anagram

Description:
Check whether two strings are anagrams by comparing character frequencies.

Approach:
- Check string lengths
- Store character counts in HashMap
- Decrease count using second string
- If mismatch found, return false

Time: O(n)
Space: O(1)
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length()!=t.length()){
        //     return false;
        // }
        // char s1Array [] = s.toCharArray();
        // char s2Array [] = t.toCharArray();

        // Arrays.sort(s1Array);
        // Arrays.sort(s2Array);
        // return Arrays.equals(s1Array,s2Array);

        if(s.length()!=t.length()){
            return false;
        }
        Map <Character , Integer> freq = new HashMap<>();

        for(char ch : s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            if(freq.containsKey(ch)){
                freq.put(ch,freq.get(ch)-1);
                if(freq.get(ch)==0){
                freq.remove(ch);
            }
            }
             else{
                return false;
            }
            
    }
    return freq.isEmpty();
}
}