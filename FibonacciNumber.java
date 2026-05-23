// Problem: Fibonacci Number
// Returns the nth Fibonacci number
// Sequence: 0, 1, 1, 2, 3, 5...
// Approach: Use iteration with two variables (first, second)
// Time: O(n) | Space: O(1)

class Solution {
    public int fib(int n) {
        int first = 0;
        int second = 1;
        int next=0;
        for(int i=2;i<=n;i++){
            next = first +second;
            first = second;
            second = next;
        }
        return second;
    }
}