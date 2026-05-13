/*
Single Number Problem

- Given a non-empty array of integers nums
- Every element appears twice except for one element
- Find that single element

Approaches:
1. Brute Force (O(n^2))
2. HashMap (O(n) time, O(n) space)
3. XOR (O(n) time, O(1) space) ← BEST

Time: O(n)
Space: O(n) for HashMap
*/


class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        // for(int i=0;i<n;i++){
        //     int cnt =0;
        //     for(int j=0;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             cnt = cnt +1;
        //         }
        //     }
        //         if(cnt == 1){
        //             return nums[i];
        //         }
            
        // }
        // return -1;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(nums[i])==1){
                return nums[i];
            }
        }

       return -1;
    }
}
