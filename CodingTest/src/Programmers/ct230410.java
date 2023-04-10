package Programmers;

class ct230410 { //크기가 작은 부분 문자열
    public int solution(String t, String p) {
        int answer = 0;
        String[] num = new String[t.length() - p.length() + 1];
        for(int i = 0; i<num.length; i++){
            num[i] = t.substring(i, i + p.length());
            if(Long.parseLong(p) >= Long.parseLong(num[i])) answer++;
        }
        return answer;
    }
}
