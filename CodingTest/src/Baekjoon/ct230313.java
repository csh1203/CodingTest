package Baekjoon;

import java.util.Scanner;

public class ct230313 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int table[][] = new int[9][9];
		
		int max = 0, x = 0, y = 0;
		
		for(int i = 0; i<table.length; i++) {
			for(int j = 0; j<table[i].length; j++) {
				table[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0; i<table.length; i++) {
			for(int j = 0; j<table[i].length; j++) {
				if(table[i][j]>max) {
					max = table[i][j];
					x = i+1;
					y = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(x+" "+y);
	}

}
