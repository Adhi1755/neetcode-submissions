class Solution {
    public int arrangeCoins(int n) {
        int start = 1;
        int end = n;

        while(start <= end){
            int mid = start + (end - start)/2;
            long formula = (long)mid * (mid+1)/2;

            if(formula == n){
                return mid;
            }else if(formula > n){
                end = mid -1;
            }else{
                start = mid+1;
            }
            
        }

        return start-1;
        
    }
}