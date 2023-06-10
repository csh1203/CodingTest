package Programmers;

import java.util.ArrayList;
import java.util.Collections;

class ct230611 { //최댓값과 최솟값
    public String solution(String s) {
        String answer = "";
        ArrayList<Integer> nums = new ArrayList<>();
        String str[] = s.split(" ");
        for(int i = 0; i<str.length; i++){
            nums.add(Integer.parseInt(str[i]));
        }
        answer = Collections.min(nums) + " " + Collections.max(nums);
        return answer;
    }
}