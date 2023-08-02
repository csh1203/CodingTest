package Programmers;

class ct230802 { //공원 산책
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x = 0, y = 0;
        int width = park[0].length() - 1;
        int height = park.length - 1;
        for(int i = 0; i<park.length; i++){
            for(int j = 0; j<park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    y = i;
                    x = j;
                }
            }
        }

        for(int i = 0; i<routes.length; i++){
            String direction = routes[i].substring(0, 1);
            int distance = Integer.parseInt(routes[i].substring(2, 3));
            int currX = x;
            int currY = y;
            boolean flag = true;
            if(direction.equals("N")){
                for(int j = 1; j<=distance; j++){
                    currY--;
                    if(currY < 0 || park[currY].charAt(currX) == 'X'){
                        flag = false;
                        break;
                    }
                }
                if(flag) y = currY;
            }else if(direction.equals("S")){
                for(int j = 1; j<=distance; j++){
                    currY++;
                    if(currY > height || park[currY].charAt(currX) == 'X'){
                        flag = false;
                        break;
                    }
                }
                if(flag) y = currY;
            }else if(direction.equals("W")){
                for(int j = 1; j<=distance; j++){
                    currX--;
                    if(currX < 0 || park[currY].charAt(currX) == 'X'){
                        flag = false;
                        break;
                    }
                }
                if(flag) x = currX;
            }else if(direction.equals("E")){
                for(int j = 1; j<=distance; j++){
                    currX++;
                    if(currX > width || park[currY].charAt(currX) == 'X'){
                        flag = false;
                        break;
                    }
                }
                if(flag) x = currX;
            }
        }
        answer[0] = y;
        answer[1] = x;
        
        return answer;
    }
}
