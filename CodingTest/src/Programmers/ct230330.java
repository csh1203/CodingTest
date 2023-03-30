package Programmers;

class ct230330_1 { //두 수의 나눗셈
    public int solution(int num1, int num2) {
        return (int)((double)num1 / (double)num2 * 1000);
    }
}

class ct230330_2 { //짝수의 합
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i<=n; i++){
            if(i % 2 == 0) answer += i;
        }
        return answer;
    }
}

class ct230330_3 { //배열의 평균값
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i = 0; i<numbers.length; i++){
            answer += numbers[i];
        }
        answer /= numbers.length;
        return answer;
    }
}

class ct230330_4 { //양꼬치
    public int solution(int n, int k) {
        k -= n / 10;
        return n * 12000 + k * 2000;
    }
}
