// Problem: Move Zeroes (LeetCode 283)

// Description:
// Given an integer array, move all 0’s to the end while maintaining the relative order of non-zero elements.

// Approach:
// - Find the first zero index
// - Use two pointers
// - Swap non-zero elements with zero positions
// - Maintain order of non-zero elements

// Time Complexity: O(n)
// Space Complexity: O(1)



class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        // List<Integer>temp = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     if(nums[i]!=0){
        //         temp.add(nums[i]);
        //     }
        // }
        // int nonzero = temp.size();
        // for(int i=0;i<nonzero;i++){
        //     nums[i]=temp.get(i);
        // }
        // for(int i=nonzero;i<n;i++){
        //     nums[i]=0;
        // }

        int j =-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return ;
        for(int i = j+1;i<n;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
            
        }

    }
}
