package Programmers;

class ct230522 { //이어 붙인 수
    public int solution(int[] num_list) {
        int answer = 0;
        String numEven = "";
        String numOdd = "";
        for(int i = 0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0) numEven += num_list[i];
            else numOdd += num_list[i];
        }
        answer = Integer.parseInt(numEven) + Integer.parseInt(numOdd);
        return answer;
    }
}

class ct230522_2 { //특정한 문자를 대문자로 바꾸기
    public String solution(String my_string, String alp) {
        String answer = my_string.replaceAll(alp, alp.toUpperCase());
        return answer;
    }
}
