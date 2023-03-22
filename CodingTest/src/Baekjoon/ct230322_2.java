package Baekjoon;

import java.util.Scanner;

public class ct230322_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		for(int i = 1; i<=length; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.println("Case #" + i + ": " + (A+B));
		}
	}

}
