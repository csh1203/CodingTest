package Programmers;

import java.util.ArrayList;
import java.util.Collections;

class ct230423 { //과일 장수
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        ArrayList<Integer> sortApple = new ArrayList<>(); 
        for(int i = 0; i<score.length; i++){
            sortApple.add(score[i]);
        }
        Collections.sort(sortApple);
        Collections.reverse(sortApple);
        int length = sortApple.size() / m;
        for(int i = 0; i<length * m; i++){
            if((i+1) % m == 0){
                answer += sortApple.get(i) * m;
            }
        }

        return answer;
    }
}
