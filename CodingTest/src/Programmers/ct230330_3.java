package Programmers;

class ct230330_9 { //삼각형의 완성조건 (1)
    public int solution(int[] sides) {
        for(int i = 0; i<sides.length-1; i++){
            for(int j =i+1; j<sides.length; j++){
                if(sides[i] > sides[j]){
                    int temp = sides[i];
                    sides[i] = sides[j];
                    sides[j] = temp;
                }
            }
        }
        if(sides[2] < sides[0] + sides[1]) return 1;
        else return 2;
    }
}

class ct230330_10 { //피자 나눠 먹기 (3)
    public int solution(int slice, int n) {
        if(n % slice != 0){
            return n / slice + 1;
        }else{
            return n / slice;
        }
        
    }
}

class ct230330_11 { //배열 자르기
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int index = 0;
        for(int i = num1; i<=num2; i++){
            answer[index++] = numbers[i];
        }
        return answer;
    }
}

class ct230330_12 { //옷가게 할인 받기
    public int solution(int price) {
        if(price >= 100000 && price<300000){
            return (int)(price * 0.95);
        }else if(price >= 300000 && price<500000){
            return (int)(price * 0.9);
        }else if(price >= 500000){
            return (int)(price * 0.8);
        }
        return price;
    }
}
