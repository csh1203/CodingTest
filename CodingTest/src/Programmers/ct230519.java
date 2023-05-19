package Programmers;

class ct230519 { //모음 제거
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') continue;
            answer += c;
        }
        return answer;
    }
}
