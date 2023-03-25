package Programmers;

class ct230325_2 {
    public boolean solution(int x) {
    	
        boolean answer = false;
        double length = Math.log10(x) + 1;
        int cnt = 0;
        int a = x;
        
        for(int i = 1; i<=length; i++){
            cnt += a%10;
            a /= 10;
        }
        
        if(x%cnt==0) answer = true;
        
        return answer;
    }
}
