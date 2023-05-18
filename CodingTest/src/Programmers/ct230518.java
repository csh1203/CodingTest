package Programmers;

class ct230518 { //둘만의 암호
    public String solution(String s, String skip, int index) {
        String answer = "";
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            int idx = 0;
            while(idx < index){
                c += 1;
                if(c > 'z') c -= 26;
                if(skip.contains(c+"")) continue;
                else idx++;
            }
            answer += c;
        }
        return answer;
    }
}