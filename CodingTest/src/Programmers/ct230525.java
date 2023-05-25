package Programmers;

class ct230525 { //주사위 게임 1
    public int solution(int a, int b) {
        if(a % 2 == 1 && b % 2 == 1) return (int)(Math.pow(a, 2) + Math.pow(b, 2));
        else if(a % 2 == 1 || b % 2 == 1) return (a + b) * 2;
        else return Math.abs(a - b);
    }
}
