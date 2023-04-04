package Programmers;

class ct230404 { //최대공약수와 최소공배수
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int number = 0;
        for(int i = 1; i<=n; i++){
            if(n % i == 0 && m % i == 0) number = i;
        }
        answer[0] = number;
        
        for(int i = m*n; i>=m; i--){
            if(i % n == 0 && i % m == 0) number = i;
        }
        answer[1] = number;
        return answer;
    }
}
