package Programmers;

class ct230315 {
    public int solution(int[] d, int budget) {
    	
        int answer = 0;
        int temp = 0;

		for(int i = 0; i<d.length; i++) {
			for(int j = i+1; j<d.length; j++) {
				if(d[i]>d[j]) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
        
        for(int i = 0; i<d.length; i++){
            if(budget>=d[i]){
                budget -= d[i];
                answer ++;
            }else{
                break;
            }
        }
        return answer;
    }
}
