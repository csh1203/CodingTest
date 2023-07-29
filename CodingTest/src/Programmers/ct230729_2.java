package Programmers;

class ct230729_2 { //n^2 배열 자르기
    public long[] solution(int n, long left, long right) {
        long[] answer = new long[(int)(right-left+1)];
        int index = 0;
        for(long i = left; i<=right; i++){
            answer[index] = Math.max(i/n, i%n)+1;
            index++;
        }
        return answer;
    }
}