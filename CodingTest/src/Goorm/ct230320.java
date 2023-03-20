package Goorm;

import java.io.*;
import java.util.Scanner;
class ct230320 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int num_1 = 0, alpha_I = 0, alpha_l = 0, sign = 0;
		
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i)=='1') num_1++;
			else if(str.charAt(i)=='I') alpha_I ++;
			else if(str.charAt(i)=='l') alpha_l ++;
			else if(str.charAt(i)=='|') sign ++;
		}
		System.out.println(num_1 + "\n" + alpha_I + "\n" + alpha_l + "\n" + sign);
	}
}
