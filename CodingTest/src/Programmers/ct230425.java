package Programmers;

class ct230425 { //실패율
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] level = new double[N];

        int index = 0;
        int solve = stages.length;
        for(int i = 0; i<N; i++){
            int count = 0;
            for(int j = 0; j<stages.length; j++){
                if(stages[j] == i+1){
                    count++;
                }
            }
            level[i] = (double)count/solve;
            solve -= count;
        }
        
        for(int i = 0; i<N; i++){
            answer[i] = i+1;
        }
        
        for(int i = 0; i<level.length-1; i++){
            for(int j = i+1; j<level.length; j++){
                if(level[i] < level[j]){
                    int temp2 = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp2;
                    
                    double temp = level[i];
                    level[i] = level[j];
                    level[j] = temp;
                }else if(level[i] == level[j] && answer[j] < answer[i]){
                    int temp2 = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp2;
                    
                    double temp = level[i];
                    level[i] = level[j];
                    level[j] = temp;
                }
            }
        }

        return answer;
    }
}
