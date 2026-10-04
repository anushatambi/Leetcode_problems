class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] getConcatenation= new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            getConcatenation[i]=nums[i];
            getConcatenation[i+nums.length]=nums[i];
        }
        return getConcatenation;
    }
}