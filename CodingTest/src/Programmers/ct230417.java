package Programmers;

import java.util.ArrayList;

class ct230417 { //폰켓몬
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> count = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(count.contains(nums[i])){
                continue;
            }else{
                count.add(nums[i]);
            }
        }
        
        if(count.size() > nums.length / 2) answer = nums.length / 2;
        else answer = count.size();
        return answer;
    }
}