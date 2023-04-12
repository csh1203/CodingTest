package Programmers;

class ct230412_2 { //콜라 문제
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            answer += n / a * b;
            n = (n / a * b) + (n % a);
        }
        return answer;
    }
}
