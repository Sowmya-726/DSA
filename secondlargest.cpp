class Solution:
    def getSecondLargest(self, arr):
        if len(arr)<2:
            return -1
        arr=list(set(arr))
        arr.sort(reverse=True)
        return arr[1] if len(arr)>1 else -1