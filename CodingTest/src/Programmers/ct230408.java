package Programmers;

class ct230408 { //이상한 문자 만들기
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int index = 0;

        
        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals(" ")){
                answer += arr[i];
                index = 0;
            } 
            else if(index % 2 == 0){
                answer += arr[i].toUpperCase();
                index++;
            }else{
                answer += arr[i].toLowerCase();
                index++;
            }
        }
        return answer;
    }
}
