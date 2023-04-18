package Programmers;

class ct230419_2 { //중복된 숫자 개수
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0; i<array.length; i++){
            if(n == array[i]) answer++;
        }
        return answer;
    }
}
