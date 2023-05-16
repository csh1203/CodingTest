package Programmers;

class ct230516 { //대충 만든 자판
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for(int i = 0; i<targets.length; i++){
            for(int j = 0; j<targets[i].length(); j++){
                int index = 101;
                for(int k = 0; k<keymap.length; k++){
                    int index2 = keymap[k].indexOf(targets[i].charAt(j));
                    if(index2 != -1){
                        if(index > index2) index = index2;
                    }
                }
                if(index == 101){
                    answer[i] = -1;
                    break;
                }else{
                    answer[i] += index + 1;
                }
            }
        }
        return answer;
    }
}
