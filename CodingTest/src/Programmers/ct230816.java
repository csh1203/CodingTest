package Programmers;

class ct230816 { //이진 변환 반복하기
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int cnt_zero = 0;
        while(s.length() != 1){
            int cnt_one = 0;
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i) == '1'){
                    cnt_one++;
                }else{
                    cnt_zero++;
                }
            }
            s = Integer.toBinaryString(cnt_one);
            cnt++;
        }
        answer[0] = cnt;
        answer[1] = cnt_zero;
        return answer;
    }
}
