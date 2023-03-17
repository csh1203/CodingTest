package Baekjoon;

import java.util.Scanner;

public class ct230316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt(); //낮
		int B = scan.nextInt(); //밤
		int V = scan.nextInt(); //목표
		int position = 0;	
		int days = 0;
		
		while(position < V) {
			days ++;
			position += A;
			if(position >= V) {
				break;
			}
			position -= B;
		}
		System.out.println(days);
	}

}
