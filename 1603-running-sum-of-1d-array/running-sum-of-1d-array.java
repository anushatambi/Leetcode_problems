class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            runningSum[i]=sum(nums,0,i);
        }
        return runningSum;
    }
    static int sum(int[] arr,int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum+=arr[i];
        }
        return sum;
    }
}