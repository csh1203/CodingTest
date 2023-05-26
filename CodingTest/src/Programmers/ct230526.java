package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

class ct230526 { //배열의 원소만큼 추가하기
    public int[] solution(int[] arr) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i : arr){
            for(int j = 0; j<i; j++){
                nums.add(i);
            }
        }
        int[] answer = new int[nums.size()];
        for(int i = 0; i<nums.size(); i++){
            answer[i] = nums.get(i);
        }
        return answer;
    }
}
