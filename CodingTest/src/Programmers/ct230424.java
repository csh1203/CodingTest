package Programmers;

import java.util.ArrayList;
import java.util.Collections;

class ct230424 { //명예의 전당 (1)
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> numSort = new ArrayList<>();
        for(int i = 0; i<score.length; i++){
            int min = 0;
            numSort.add(score[i]);
            Collections.sort(numSort);
            Collections.reverse(numSort);
            if(numSort.size() <= k){
                min = numSort.get(i);
            }else{
                min = numSort.get(k - 1);
            }
            answer[i] = min;
        }
        return answer;
    }
}