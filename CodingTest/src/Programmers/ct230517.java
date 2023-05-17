package Programmers;

import java.util.ArrayList;

class ct230517 { //햄버거 만들기
    public int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> order = new ArrayList<>();
        for(int i = 0; i<ingredient.length; i++){
            order.add(ingredient[i]);
            if(order.size() > 3 && order.get(order.size() - 4) == 1 &&
                                order.get(order.size() - 3) == 2 && 
                                order.get(order.size() - 2) == 3 && 
                                order.get(order.size() - 1) == 1){
                answer++;
                for(int j = 0; j<4; j++){
                    order.remove(order.size() - 1);
                }
            }
        }
        return answer;
    }
}
