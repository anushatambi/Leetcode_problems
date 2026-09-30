class Solution {
    public int addDigits(int num) {
        int ans=sum(num);
        while(String.valueOf(ans).length()>1){
            ans=sum(ans);
        }
        return ans;
    }
    static int sum(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            num/=10;
            sum+=rem;
        }
        return sum;
    }
}