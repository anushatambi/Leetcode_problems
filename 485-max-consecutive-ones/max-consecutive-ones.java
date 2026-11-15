import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        ArrayList<Integer> list=new ArrayList<>(10);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c+=1;
            }
            else{
               list.add(c);
               c=0; 
            }
        }
        list.add(c);
        return Collections.max(list);
    }
}