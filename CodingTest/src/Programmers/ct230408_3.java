package Programmers;

class ct230408_3 { //최소직사각형
    public int solution(int[][] sizes) {
        int answer = 0;
        int height_max = 0;
        int width_max = 0;
        for(int i = 0; i<sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        for(int i = 0; i<sizes.length; i++){
            if(sizes[i][0] > height_max){
                height_max = sizes[i][0];
            }
        }
        
        for(int i = 0; i<sizes.length; i++){
            if(sizes[i][1] > width_max){
                width_max = sizes[i][1];
            }
        }
        return height_max * width_max;
    }
}
