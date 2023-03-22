package Baekjoon;

import java.util.Scanner;

public class ct230322_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[] = new int[scan.nextInt()];
		int cnt = 0;
		for(int i = 0; i<num.length; i++) {
			num[i] = scan.nextInt();
		}
		int findNum = scan.nextInt();
		
		for(int i = 0; i<num.length; i++) {
			if(num[i]==findNum) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
