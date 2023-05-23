package Programmers;

class ct230523 { //신규 아이디 추천
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();
        StringBuilder answer1 = new StringBuilder();
        for(int i = 0; i<new_id.length(); i++){
            if((new_id.charAt(i) >= 97 && new_id.charAt(i) <= 122) || 
              (new_id.charAt(i) >= 48 && new_id.charAt(i) <= 57) ||
              new_id.charAt(i) == '-' || new_id.charAt(i) == '_' ||
               new_id.charAt(i) == '.'){
                answer1.append(new_id.charAt(i));
            }
        }
        answer = answer1.toString();
        while(answer.contains("..")){
            answer = answer.replace("..", ".");
        }
        if(answer.charAt(0) == '.'){
            answer = answer.substring(1, answer.length());
        }
        if(answer.length() > 0){
            if(answer.charAt(answer.length() - 1) == '.'){
                answer = answer.substring(0, answer.length()-1);
            }            
        }else{
            answer = "a";
        }
        if(answer.length() >= 16){
            answer = answer.substring(0, 15);
            if(answer.charAt(answer.length() - 1) == '.'){
                answer = answer.substring(0, answer.length() - 1);
            }
        }
        StringBuilder answer2 = new StringBuilder(answer);
        String lastStr = answer.charAt(answer.length() - 1) + "";
        for(int i = answer.length(); i<3; i++){
            answer2.append(lastStr);
        }
        answer = answer2.toString();
        return answer;
    }
}
