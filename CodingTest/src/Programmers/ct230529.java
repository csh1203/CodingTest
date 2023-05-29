package Programmers;

class ct230529 { //세균 증식
    public int solution(int n, int t) {
        int answer = n * (int)(Math.pow(2, t));
        return answer;
    }
}
