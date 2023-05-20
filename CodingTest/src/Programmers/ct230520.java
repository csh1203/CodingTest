package Programmers;

class ct230520 { // 키패드 누르기
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int[] rHand = {3, 0};
        int[] lHand = {3, 2};
        int[] cHand = {0, 0};
        int lLength = 0, rLength = 0;
        hand = (hand.charAt(0) + "").toUpperCase();
        for(int x : numbers){
            if((x == 1) || (x == 4) || (x == 7)) {
                sb.append("L");
                if(x == 1) {
                    lHand[0] = 0;
                    lHand[1] = 0; 
                }else if(x == 4){
                    lHand[0] = 1;
                    lHand[1] = 0;
                }else if(x == 7){
                    lHand[0] = 2;
                    lHand[1] = 0;
                } 
            }else if((x == 3) || (x == 6) || (x == 9)) {
                sb.append("R");
                if(x == 3) {
                    rHand[0] = 0;
                    rHand[1] = 2; 
                }else if(x == 6){
                    rHand[0] = 1;
                    rHand[1] = 2;
                }else if(x == 9){
                    rHand[0] = 2;
                    rHand[1] = 2;
                } 
            }else{
                if(x == 2) {
                    cHand[0] = 0;
                    cHand[1] = 1; 
                }else if(x == 5){
                    cHand[0] = 1;
                    cHand[1] = 1;
                }else if(x == 8){
                    cHand[0] = 2;
                    cHand[1] = 1;
                }else if(x == 0){
                    cHand[0] = 3;
                    cHand[1] = 1;  
                }
                
                lLength = (Math.max(cHand[0], lHand[0]) - Math.min(cHand[0], lHand[0])) + 
                            (Math.max(cHand[1], lHand[1]) - Math.min(cHand[1], lHand[1]));
                rLength = (Math.max(cHand[0], rHand[0]) - Math.min(cHand[0], rHand[0])) + 
                            (Math.max(cHand[1], rHand[1]) - Math.min(cHand[1], rHand[1]));
                
                if(lLength > rLength) {
                    sb.append("R");
                    rHand[0] = cHand[0];
                    rHand[1] = cHand[1];
                }
                else if(rLength > lLength) {
                    sb.append("L");
                    lHand[0] = cHand[0];
                    lHand[1] = cHand[1];
                }else {
                    sb.append(hand);
                    if(hand.equals("L")) {
                        lHand[0] = cHand[0];
                        lHand[1] = cHand[1];
                    }
                    else {
                        rHand[0] = cHand[0];
                        rHand[1] = cHand[1];                        
                    }
                }
            }
        }
        String answer = sb.toString();
        return answer;
    }
}
