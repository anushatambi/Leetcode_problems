import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

class Solution {
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> arr=new ArrayList<>(5);
        for(int[] row: accounts){
            int sum=0;
            for(int num:row){
                sum+=num;
            }
            arr.add(sum);
        }

        return Collections.max(arr);
    }
}