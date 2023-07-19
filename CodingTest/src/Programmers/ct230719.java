package Programmers;

class ct230719 { //다음 큰 숫자
    public int solution(int n) {
        int answer = 0;
        int now = Integer.bitCount(n);
        while(true){
            n++;
            int next = Integer.bitCount(n);
            if(now == next) {
                break;
            }
        }
        answer = n;
        return answer;
    }
}
