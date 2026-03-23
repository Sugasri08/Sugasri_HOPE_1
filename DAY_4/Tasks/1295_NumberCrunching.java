class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int numCount=0;
        for(int i:nums){
            while(i>0){
                i=i/10;
                numCount++;
            }
            if(numCount%2==0){
                count++;
            }
            numCount=0;
        }
        return count;
    }
}