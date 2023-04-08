package Programmers;

class ct230408_2 { //3진법 뒤집기
    public int solution(int n) {
        String answer = "";
        while(n != 0){
            answer += n % 3;
            n /= 3;
        }
        return Integer.parseInt(answer, 3);
    }
}
