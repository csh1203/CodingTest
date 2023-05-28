package Programmers;

import java.util.ArrayList;
import java.util.Collections;

class ct230528 { //바탕화면 정리
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        ArrayList<Integer> Y = new ArrayList<>();
        ArrayList<Integer> X = new ArrayList<>();
        for(int i = 0; i < wallpaper.length; i++){
            for(int j = 0; j < wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j) != '#') continue;
                Y.add(i);
                X.add(j);
            }
        }
        Collections.sort(Y);
        Collections.sort(X);
        answer[0] = Y.get(0);
        answer[1] = X.get(0);
        answer[2] = Y.get(Y.size() - 1) + 1;
        answer[3] = X.get(X.size() - 1) + 1;
        return answer;
    }
}