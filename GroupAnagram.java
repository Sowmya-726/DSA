/*
Problem: Group Anagrams

Description:
Group strings that are anagrams of each other from a given array of strings.

Approach:
- Sort each string to form a key
- Use HashMap to group strings with same sorted key
- Return all grouped values

Time: O(n * k log k)
Space: O(n * k)
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String word = strs[i];
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(!map.containsKey(sorted)){
                map.put(sorted , new ArrayList<String>());
            }
            map.get(sorted).add(word);
        }
        return new ArrayList<>(map.values());
    }
}