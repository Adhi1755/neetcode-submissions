class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1; int end = num;

        while(start <= end){
            int mid = start + (end - start)/2;
            long sqrt = (long)mid*mid;

            if(sqrt == num){
                return true;
            }else if(sqrt > num){
                 end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return false;
    }
}