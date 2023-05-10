package Goorm;

import java.io.*;
import java.util.Scanner;
class ct230510 { //거스름 돈
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int coin = scan.nextInt();
		int count = 0;
		int[] change = {40, 20, 10, 5, 1};
		for(int i = 0; i<change.length; i++){
			if(coin >= change[i]){
				count += coin / change[i];
			}
			coin %= change[i];
		}
		System.out.println(count);
	}
}
