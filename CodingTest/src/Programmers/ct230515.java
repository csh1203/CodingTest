package Programmers;

class ct230515 { //문자열 나누기
    public int solution(String s) {
        int answer = 0;
        int correct = 0;
        int another = 0;
        char start = s.charAt(0);
        for(int i = 0; i<s.length(); i++){
           if(correct == another) {
                answer++;
                start = s.charAt(i);
            }
            
            if(start == s.charAt(i)) correct++;
            else another++;
            

        }
        return answer;
    }
}