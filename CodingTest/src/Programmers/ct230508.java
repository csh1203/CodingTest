package Programmers;

class ct230508 { //로또의 최고 순위와 최저 순위
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int winNumbers = 0;
        for(int i = 0; i<lottos.length; i++){
            if(lottos[i] == 0) zeroCount++;
        }
        for(int i = 0; i<win_nums.length; i++){
            for(int j = 0; j<lottos.length; j++){
                if(win_nums[i] == lottos[j]) winNumbers++;
            }
        }
        if(winNumbers >= 2 && winNumbers <= 6){
            answer[1] = 7 - winNumbers;
        }else if(winNumbers <= 1){
            answer[1] = 6;
        }
        
        if(winNumbers + zeroCount >= 2 && winNumbers + zeroCount <= 6){
            answer[0] = 7 - (winNumbers + zeroCount);
        }else if(winNumbers + zeroCount <= 1){
            answer[0] = 6;
        }
        return answer;
    }
}
