package Programmers;

import java.util.*;

public class ct230405 { //같은 숫자는 싫어
    public int[] solution(int []arr) {
        int cnt = 0;
        int index = 0;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]) cnt++;
        }
        int[] answer = new int[cnt+1];
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                answer[index++] = arr[i];
            }
        }            
        answer[answer.length-1] = arr[arr.length-1];
        return answer;
    }
}
