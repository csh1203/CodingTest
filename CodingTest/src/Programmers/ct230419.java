package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

class ct230419 { //모의고사
    public int[] solution(int[] answers) {

        int[] first = {1,2,3,4,5}; //5
        int[] second = {2,1,2,3,2,4,2,5}; //8
        int[] third = {3,3,1,1,2,2,4,4,5,5}; //10

        int[] score = new int[3];
        for(int i = 0; i<answers.length; i++){
            if(answers[i] == first[i%5]) score[0]++;
            if(answers[i] == second[i%8]) score[1]++;
            if(answers[i] == third[i%10]) score[2]++;
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> answ = new ArrayList<>();
        for(int i = 0; i<score.length; i++){
            if(max == score[i]) answ.add(i+1);
        }
        int[] answer = new int[answ.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = answ.get(i);
        }

        return answer;
    }
}
