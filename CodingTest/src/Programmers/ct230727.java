package Programmers;

class ct230727 { //멀리 뛰기
    public long solution(int n) {
        long[] count = new long[2001];
        count[1] = 1;
        count[2] = 2;
        for(int i = 3; i<2001; i++){
            count[i] = (count[i-2] + count[i-1]) % 1234567;
        }
        return count[n];
    }
}
