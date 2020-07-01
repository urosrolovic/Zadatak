package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		sayHello(num);
		scanner.close();

	}

	private static void sayHello(int num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < num; i++) {
			System.out.println("Hello Word");
		}
	}

}
