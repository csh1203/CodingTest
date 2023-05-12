package Programmers;

class ct230512 { //숫자 짝꿍
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] xCount = {0,0,0,0,0,0,0,0,0,0};
        int[] yCount = {0,0,0,0,0,0,0,0,0,0};
        
        for(int i = 0; i<X.length(); i++){
            xCount[X.charAt(i) - 48]++;
        }
        for(int i = 0; i<Y.length(); i++){
            yCount[Y.charAt(i) - 48]++;
        }

        for(int i = xCount.length - 1; i >= 0; i--){
            for(int j = 0; j<Math.min(xCount[i], yCount[i]); j++){
                answer.append(i);
            }
        }
        
        if("".equals(answer.toString())) return "-1";
        else if(answer.toString().charAt(0) == '0') return "0";
        else return answer.toString();
    }
}
