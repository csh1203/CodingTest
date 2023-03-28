package Programmers;

class ct230328{
    public int[] solution(int[] arr, int divisor) {
        int length = 0;
        int cnt = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                length++;
            }
        }
        
        if(length==0){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[length];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        
        for(int i = 0; i<answer.length-1; i++) {
        	for(int j = i+1; j<answer.length;j++) {
        		if(answer[i]>answer[j]) {
        			int temp = answer[i];
        			answer[i] = answer[j];
        			answer[j] = temp;
        		}
        	}
        }
        
        return answer;        
    }
}

