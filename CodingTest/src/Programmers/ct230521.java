package Programmers;

import java.util.Arrays;

class ct230521 { // 중앙값 구하기
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[array.length / 2];
        return answer;
    }
}
