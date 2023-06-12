package Programmers;

class ct230612 {
    public String solution(String s) { //JadenCase 문자열 만들기
        String answer = "";
        answer += (s.charAt(0)+"").toUpperCase();
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i - 1) == ' '){
                answer += (s.charAt(i)+"").toUpperCase();
            }else{
                answer += (s.charAt(i)+"").toLowerCase();
            }
        }
        return answer;
    }
}