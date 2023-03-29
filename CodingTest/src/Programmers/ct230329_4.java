package Programmers;

class ct230329_7 {
    public int solution(int num1, int num2) {
        return num1 % num2;
    }
}

class ct230329_8 {
    public int solution(int age) {
        return 2022 - age + 1;
    }
}

class ct230329_9 {
    public int solution(int num1, int num2) {
        return num1 + num2;
    }
}

class ct230329_10 {
    public int solution(int angle) {
        int answer = 0;
        if(angle>0 && angle<90){
            answer = 1;
        }else if(angle == 90){
            answer = 2;
        }else if(angle < 180){
            answer = 3;
        }else if(angle == 180){
            answer = 4;
        }
        return answer;
    }
}
