package DAY_6.LeetCode;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        int i=0;
        while(i<=nums.length-1&&nums[i]!=target)  i++;
        arr[0]=i;
        while( i<=nums.length-1&&nums[i]==target)  i++;
        arr[1]=i-1;
        if(arr[0]>=nums.length||nums[arr[0]]!=target){
            arr[0]=-1;
            arr[1]=-1;
        }
        return arr;
    }
}