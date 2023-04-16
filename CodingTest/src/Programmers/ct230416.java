package Programmers;

class ct230416 { //2016년
    public String solution(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int days = 0;
        for(int i = 0; i < a - 1; i++){
            days += month[i];
        }
        days += b - 1;
        return week[days % 7];
    }
}
