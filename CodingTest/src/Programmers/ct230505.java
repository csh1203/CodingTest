package Programmers;

class ct230505 { //[1차] 다트 게임
    public int solution(String dartResult) {
        int answer = 0;
        int[] dart = new int[3];
        int index = -1;
        String number = "";
        int n = 0;
        for(int i = 0; i<dartResult.length(); i++){
            char c = dartResult.charAt(i);
            if(Character.isDigit(c)){
                number += String.valueOf(c);
            }else if(Character.isAlphabetic(c)){
                n = Integer.parseInt(number);
                if(c == 'S'){
                    dart[++index] = (int)Math.pow(n, 1);
                }else if(c == 'D'){
                    dart[++index] = (int)Math.pow(n, 2);
                }else if(c == 'T'){
                    dart[++index] = (int)Math.pow(n, 3);
                }
                number="";
            }else{
                if(c == '*'){
                    if(index == 0){
                        dart[index] *= 2;
                    }else{
                        dart[index] *= 2;
                        dart[index-1] *= 2;
                    }
                }else if(c == '#'){
                    dart[index] *= -1;
                }
            }
            
        }
        answer = dart[0] + dart[1] + dart[2];
        return answer;
    }
}