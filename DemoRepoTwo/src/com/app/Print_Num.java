package com.app;
import java.util.Scanner;
public class Print_Num {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();
		
		for(int i=0;i<=num;i++)
		{
			System.out.println(i);
		}
	}
}
