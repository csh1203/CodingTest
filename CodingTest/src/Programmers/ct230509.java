package Programmers;

class ct230509 { //기사단원의 무기
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] nums = new int[number];
        for(int i = 1; i<=number; i++){
            for(int j = 1; j * j <=i; j++){
                if(j * j == i) nums[i - 1]++;
                else if(i % j == 0) nums[i - 1] += 2;
            }
        }
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > limit) nums[i] = power;
            answer += nums[i];
        }
        return answer;
    }
}
