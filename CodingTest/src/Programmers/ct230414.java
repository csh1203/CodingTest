package Programmers;

class ct230414 { //가장 가까운 같은 글자
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = -1;
            for(int j = i-1; j>=0; j--){
                if(s.charAt(i) == s.charAt(j)){
                    answer[i] = i - j;
                    break;
                }
            }
        }
        return answer;
    }
}
