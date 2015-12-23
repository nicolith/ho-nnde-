package Chap5;

import java.util.Scanner;

class chap51 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数：");
		int n = stdIn.nextInt();

		System.out.printf("8進数では%o\nです。",n);
		System.out.printf("16進数では%x\nです。",n);
	}



}