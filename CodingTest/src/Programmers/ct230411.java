package Programmers;

import java.util.ArrayList;
import java.util.Collections;

class ct230411 { //두 개 뽑아서 더하기
    public int[] solution(int[] numbers) {

        ArrayList<Integer> number = new ArrayList<>();
        for(int i = 0; i<numbers.length - 1; i++){
            for(int j = i + 1; j<numbers.length; j++){
                if(number.contains(numbers[i] + numbers[j])){
                    continue;
                }else{
                    number.add(numbers[i] + numbers[j]);
                }
            }
        }
        Collections.sort(number);
        int[] answer = new int[number.size()];
        for(int i = 0; i<number.size(); i++){
            answer[i] = number.get(i);
        }
        return answer;
    }
}
