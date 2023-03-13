package Goorm;

import java.io.*;
import java.util.Scanner;
class ct230313 {
   public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      int width = scan.nextInt();
      int height = scan.nextInt();
      int flag = 2;
      
      String snake[][] = new String[width][height];
      
	  for(int i = 0; i<snake.length; i+=2){
	    for(int j = 0; j<snake[i].length; j++){
	    	snake[i][j] = "#";
	    }
	  }
	    
	  for(int i = 1; i<snake.length; i+=2){
	    for(int j = 0; j<snake[i].length; j++){
	    	if(flag%2==0){
	    		if(j==snake[i].length-1){
	        		snake[i][j] = "#";
	        	}else{
	        		snake[i][j] = ".";
	        	}
	        }else{
	        	if(j==0){
	        		snake[i][j] = "#";
	        	}else{
		            snake[i][j] = ".";
		        }
	        }
	    }
	    flag++;
	  }
      
      for(int i = 0; i<snake.length; i++){
         for(int j = 0; j<snake[i].length; j++){
            System.out.print(snake[i][j]);
         }
         System.out.println();
      }
   }
}
