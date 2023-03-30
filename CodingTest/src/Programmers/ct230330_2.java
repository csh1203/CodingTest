package Programmers;

class ct230330_5 { //점의 위치 구하기
    public int solution(int[] dot) {
        if(dot[0] > 0 && dot[1] > 0){
            return 1;
        }else if(dot[0] < 0 && dot[1] > 0){
            return 2;  
        }else if(dot[0] < 0 && dot[1] < 0){
            return 3;
        }else{
            return 4; 
        } 
    }
}

class ct230330_6 { //피자 나눠먹기 (1)
    public int solution(int n) {
        int answer = n / 7;
        if(n > answer * 7) answer++;
        return answer;
    }
}

class ct230330_7 { //머쓱이보다 키 큰 사람
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] > height) answer++;
        }
        return answer;
    }
}

class ct230330_8 { //순서쌍의 개수
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0) answer++;
        }
        return answer;
    }
}