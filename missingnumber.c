int missingNumber(int* nums, int numsSize)
 {
    int i,sum=0;
    for(i=0;i<numsSize;i++)
    {
        sum=sum+nums[i];
    }
    int p=numsSize;
    int m=(p*(p+1))/2;
    return(m-sum);
    return 0;
 }