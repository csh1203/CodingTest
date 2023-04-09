package Programmers;

import java.util.ArrayList;
import java.util.Collections;

class ct230409_2 { //K번째 수
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i<answer.length; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j = commands[i][0] - 1; j<commands[i][1]; j++){
                arr.add(array[j]);
            }
            Collections.sort(arr);
            answer[i] = arr.get(commands[i][2]-1);
        }
        return answer;
    }
}
