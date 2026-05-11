// Problem: Union of Two Sorted Arrays (GeeksForGeeks)

// Description:
// Given two sorted arrays, find their union (all unique elements in sorted order).

// Approach:
// - Use two pointers (i, j) to traverse both arrays
// - Compare elements and add the smaller one first
// - Avoid duplicates by checking last inserted element
// - Add remaining elements after one array finishes

// Time Complexity: O(n + m)
// Space Complexity: O(n + m)

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        // Set<Integer> set = new TreeSet<>();
        
        // for(int i=0;i<a.length;i++){
        //     set.add(a[i]);
        // }
        // for(int i=0;i<b.length;i++){
        //     set.add(b[i]);
        // }
        
            
        // return new ArrayList<>(set);
        
        List<Integer> unique = new ArrayList<>();
        
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                if(unique.size()==0 || unique.get(unique.size()-1) != a[i]){
                unique.add(a[i]);}
                i++;
            }
            else{
                if(unique.size()==0 || unique.get(unique.size()-1) != b[j]){
                unique.add(b[j]);}
                j++;
            }
            
        }
        while(i<a.length){
            if(unique.size()==0 || unique.get(unique.size()-1) != a[i]){
                unique.add(a[i]);}
                i++;
        }
         while(j<b.length){
            if(unique.size()==0 || unique.get(unique.size()-1) != b[j]){
                unique.add(b[j]);}
                j++;
        }
        return new ArrayList<>(unique);
    }
}