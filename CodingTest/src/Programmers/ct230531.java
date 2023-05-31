package Programmers;

class ct230531 { // 암호 해독
    public String solution(String cipher, int code) {
        StringBuffer sb = new StringBuffer();
        for(int i = code - 1; i<cipher.length(); i+=code){
            sb.append(cipher.charAt(i));
        }
        String answer = sb.toString();
        return answer;
    }
}
