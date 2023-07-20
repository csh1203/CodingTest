package Programmers;

class ct230720 { //피보나치 수
    public int solution(int n) {
        int[] count = new int[n+1];
        for(int i = 0; i<=n; i++){
            if(i == 0) count[i] = 0;
            else if(i == 1) count[i] = 1;
            else{
                count[i] = (count[i - 2] + count[i - 1]) % 1234567;
                
            }
        }
        return count[n];
    }
}
