package Programmers;

class ct230605 { //꼬리 문자열
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i = 0; i<str_list.length; i++){
            if(str_list[i].contains(ex)){
                str_list[i] = str_list[i].replace(str_list[i], "");
            }
            answer += str_list[i];
        }
        return answer;
    }
}