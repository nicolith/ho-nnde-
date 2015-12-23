package Chap6;

import java.util.Random;
import java.util.Scanner;

public class Chap6_04 {
	public static void main(String[] args)
	{
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数 : ");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for(int i = 0; i < n; i++)
		{
			a[i] = 1 + rand.nextInt(10);
		}
		
		for(int i = 10; i > 0; i--)	{
			for(int j = 0; j < n; j++)
			{
				if(a[j] >= i)
					System.out.print('*');
				else
					System.out.print(' ');

				if(j < n - 1)
					System.out.print(' ');
			}
			System.out.println(' ');
		}

		for(int i = 0; i < n * 2 - 1; i++)
		{
			System.out.print('-');
		}
		System.out.println(' ');

		for(int i = 0; i < n; i++)
		{
			System.out.print(i % 10);
			if(i < n - 1)
				System.out.print(' ');
		}
		System.out.println(' ');
	}
}
