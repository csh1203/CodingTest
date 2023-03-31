package Programmers;

class ct230401_2 { //문자열 내림차순으로 배치하기
    public String solution(String s) {
        String answer = "";
        char[] answer_first = new char[s.length()];
        for(int i = 0; i<s.length(); i++){
            answer_first[i] = s.charAt(i);
        }
        
        for(int i = 0; i<answer_first.length - 1; i++){
            for(int j = i + 1; j<answer_first.length; j++){
                if(answer_first[i] < answer_first[j]){
                    char temp = answer_first[i];
                    answer_first[i] = answer_first[j];
                    answer_first[j] = temp;
                }
            }
        }
        
        for(int i = 0; i<answer_first.length; i++){
            answer += answer_first[i];
        }
        
        return answer;
    }
}
