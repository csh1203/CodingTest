package Programmers;

class ct230321_3 {
    public long[] solution(long n) {

        int length = (int)(Math.log10(n) + 1);
        long[] answer = new long[length];
        for(int i = 0; i<answer.length; i++){
            answer[i] = n%10;
            n /= 10;
        }

        return answer;
    }
}
