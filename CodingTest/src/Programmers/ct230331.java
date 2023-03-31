package Programmers;

class ct230331_1 { //배열 뒤집기
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int index = num_list.length - 1;
        for(int i = 0; i<num_list.length; i++){
            answer[i] = num_list[index--];
        }
        return answer;
    }
}

class ct230331_2 { //최댓값 만들기 (1)
    public int solution(int[] numbers) {
        for(int i = 0; i<numbers.length - 1; i++){
            for(int j = i+1; j<numbers.length; j++){
                if(numbers[i] < numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        
        return numbers[0] * numbers[1];
    }
}

class ct230331_3 { //문자열 뒤집기
    public String solution(String my_string) {
        String answer = "";
        for(int i = my_string.length() - 1; i >= 0 ; i--){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}

class ct230331_4 { //짝수 홀수 개수
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd = 0;
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                answer[0]++;;
            }else{
                answer[1]++;
            }
        }
        return answer;
    }
}