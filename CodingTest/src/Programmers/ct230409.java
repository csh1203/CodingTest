package Programmers;

class ct230409 { //숫자 문자열과 영단어
    public int solution(String s) {

        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i = 0; i<num.length; i++){
            s = s.replace(num[i], Integer.toString(i));
        }
        int answer = Integer.parseInt(s);
        return answer;
    }
}
