package Programmers;

class ct230331 { //가운데 글자 가져오기
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        if(length % 2 == 0){
            answer += s.charAt(length / 2 - 1);
            answer += s.charAt(length / 2 );
        }else{
            answer += s.charAt(length / 2 );
        }
        return answer;
    }
}
