package Programmers;

class ct230324_2 {
    public long solution(long n) {
        String answer = "";
        String str = Long.toString(n);
        int arr[] = new int[str.length()];
        int temp = 0;
        
        for(int i =0; i<arr.length;i++){
            arr[i] = Character.getNumericValue(str.charAt(i));
        }

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if (arr[i] < arr[j]) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                }
            } 
            answer += arr[i];
        }
        return Long.parseLong(answer);
    }
}
