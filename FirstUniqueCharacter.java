/*
Problem: First Unique Character in a String

Description:
Given a string s, find the first non-repeating character 
and return its index. If it does not exist, return -1.

Approach:
- Use a frequency array of size 26
- Count occurrences of each character
- Traverse string again to find first char with count = 1

Time: O(n)
Space: O(1)
*/



class Solution {
    public int firstUniqChar(String s) {
        
//         for(int i=0;i<s.length();i++){
//             int count =0;
//             char ch = s.charAt(i);
//             for(int j=0;j<s.length();j++){
//                 if(s.charAt(j)==ch) count++;
                
//             }
//                 if(count==1) return i;
//         }
//           return -1;


            // Map <Character , Integer>freq = new HashMap<>();
            // for(int i=0;i<s.length();i++){
            //     char ch = s.charAt(i);
            //     freq.put(ch,freq.getOrDefault(ch,0)+1);
            // }
            // for(int i=0;i<s.length();i++){
            //     char ch = s.charAt(i);
            //     if(freq.get(ch) == 1){
            //         return i;
            //     }
            // }
            // return -1;

            int freq[]= new int[26];

            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                freq[ch - 'a']++;
            }
            for(int i=0;i<s.length();i++){
                
                if(freq[s.charAt(i) - 'a']==1){
                    return i;
                }
            }
return -1;

            }
        }