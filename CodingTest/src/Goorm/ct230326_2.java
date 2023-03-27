package Goorm;

import java.io.*;
import java.util.Scanner;
class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		for(int i = 1; i<=scan.nextInt(); i++){
			cnt = i*i;
		}
		System.out.println(cnt);
	}
}
