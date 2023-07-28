package Programmers;

import java.util.*;

class ct230728 { //연속 부분 수열 합의 개수
    public int solution(int[] elements) {
        int answer = 0;
        HashSet<Integer> nums = new HashSet<>();
        for(int i = 1; i<=elements.length; i++){
            for(int j = 0; j<elements.length; j++){
                int sum = 0;
                for(int k = j; k<j + i; k++){
                    sum += elements[k % elements.length];
                }
                nums.add(sum);
            }
        }
        
        return nums.size();
    }
}
