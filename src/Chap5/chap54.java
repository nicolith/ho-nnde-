package Chap5;

import java.util.Scanner;

class chap54 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("x："); int x = stdIn.nextInt();
		System.out.print("y："); int y = stdIn.nextInt();
		System.out.print("z："); int z = stdIn.nextInt();

		int sum = (x + y + z);

		System.out.println("xとyとzの合計値は" + sum + "です。");

		System.out.println("xとyとzの平均値は" + (double) sum / 3.0 + "です。");
	}



}