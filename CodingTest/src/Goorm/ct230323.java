package Goorm;

import java.io.*;
import java.util.Scanner;

class ct230323 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int older_brother = scan.nextInt();
		int younger_brother = scan.nextInt();
		int days = scan.nextInt();
		
		for(int i = 1; i<= days; i++){
			if(i%2 != 0){//형일경우
				if(older_brother%2==0){//형이 짝수일 경우
					younger_brother += older_brother/2;
					older_brother -= older_brother/2;
				}else{//형이 홀수일 경우
					younger_brother += (older_brother/2) + 1;
					older_brother -= (older_brother/2) + 1;
				}
			}else{//동생일 경우
				if(younger_brother%2==0){//동생이 짝수일 경우
					older_brother += younger_brother/2;
					younger_brother -= younger_brother/2;
				}else{ //동생이 홀수일 경우
					older_brother += (younger_brother/2) + 1;
					younger_brother -= (younger_brother/2) + 1;
				}
			}
		}
		System.out.println(older_brother + " " + younger_brother);
	}
}