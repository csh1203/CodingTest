package Programmers;

class ct230507 { //덧칠하기
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int roller = section[0];
        for(int i = 0; i<section.length; i++){
            if(roller + m - 1 < section[i]){
                roller = section[i];
                answer++;
            }
        }
        return answer;
    }
}
