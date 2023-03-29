package Programmers;

class ct230329 {
    public int[] solution(int[] arr) {
        int[] min = {arr[0]};
        int index = 0;
        if(arr.length==1){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[arr.length-1];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min[0]){
                min[0] = arr[i];
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(min[0] == arr[i]){
                continue;
            }
            answer[index++] = arr[i];
        }
        
        
        return answer;
    }
}