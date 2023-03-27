package Programmers;

class ct230327 {
    public long solution(int a, int b) {

        long answer = 0;
        int min, max = 0;
        
        if(a == b) {
            return a;
        }else if(a>b){ 
            max = a; min = b; 
        }else{
            max = b; min = a;
        } 
        
        for(int i = min; i<=max; i++){
            answer += i;
        }
       
        return answer;
    }
}
