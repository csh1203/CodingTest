package Programmers;

class ct230422 { //추억 점수
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0; i<photo.length; i++){
            for(int j = 0; j<name.length; j++){
                for(int k = 0; k<photo[i].length; k++){
                    if(name[j].equals(photo[i][k])){
                        answer[i] += yearning[j];
                    }
                }
            }
        }
        return answer;
    }
}