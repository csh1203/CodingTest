package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

class ct230721 { //영어 끝말잇기
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> w = new ArrayList<>(Arrays.asList(words));
        for(int i = 0; i<w.size(); i++){
            if(w.indexOf(w.get(i)) != i){
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }else if(w.get(i).length() <= 1){
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }else if(i > 0 && (w.get(i - 1).charAt(w.get(i - 1).length() - 1) != w.get(i).charAt(0))){
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
        }
        return answer;
    }
}
