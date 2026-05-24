/*
Problem: Count Characters with K Group Occurrences

Description:
Given a string s and an integer k, count the characters
that have exactly k occurrence groups.

If consecutive characters are same, they are counted
as one occurrence group.

Example:
s = "geeksforgeeks", k = 2

Groups:
g | ee | k | s | f | o | r | g | ee | k | s

Group counts:
g = 2
e = 2
k = 2
s = 2

Answer = 4

Approach:
- Use HashMap to store group counts
- Traverse string
- If current character differs from previous,
  it starts a new group
- Increase group count in HashMap
- Traverse map values and count frequencies equal to k

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Sol {
    int getCount(String s, int k) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
    
        int n = s.length();
        for(int i=0;i<n;i++){
        if(i==0 || s.charAt(i) != s.charAt(i-1)){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
    
        }
        int count =0;
        for(int val : map.values()){
            if(val==k){
                count=count+1;
            }
        }
        return count;
        
    }
}
