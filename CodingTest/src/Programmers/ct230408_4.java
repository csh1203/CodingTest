package Programmers;

class ct230408_4 { //[1차]비밀지도
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i<n; i++){
            String result = "";
            String ar1 = Integer.toBinaryString(arr1[i]);
            String ar2 = Integer.toBinaryString(arr2[i]);
            while(ar1.length() < n){
                ar1 = "0" + ar1; 
            }
            while(ar2.length() < n){
                ar2 = "0" + ar2;
            }
            String[] ar1_2 = ar1.split("");
            String[] ar2_2 = ar2.split("");
            for(int j = 0; j<n; j++){
                if(ar1_2[j].equals("1") || ar2_2[j].equals("1")){
                    result += "#";
                }else result += " ";
            }
            answer[i] = result;
        }
        
        return answer;
    }
} 
