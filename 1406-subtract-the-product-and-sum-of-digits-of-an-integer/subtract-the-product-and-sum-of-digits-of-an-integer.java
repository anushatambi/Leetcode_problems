class Solution {
    public int subtractProductAndSum(int n) {
        int res;
        int sum=0;
        int p=1;
        while(n>0){
            int rem=n%10;
            n/=10;
            sum=sum+rem;
            p=p*rem;
        }
        res=p-sum;
        return res;
    }
}