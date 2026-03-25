class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,1);
        }
        for(int i=1;i<=100001;i++){
            if(map.containsKey(i))    continue;
            else{
                return i;
            }

        }
        return -1;
    }
}

//another approach
// int ctr=1,i=0;
// while(i<nums.length&&i<=0)  i++;
// for(;i<nums.length;i++){
//     if(nums[i]>ctr) return i;
//     else if(nums[i]==ctr)   ctr++;
// }