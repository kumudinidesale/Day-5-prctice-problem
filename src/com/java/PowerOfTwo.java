package com.java;

import java.util.Scanner;

public class PowerOfTwo {
	public static void powerOfTwo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();

		while (num % 2 == 0) {
			num = num / 2;
		}
		if (num == 1) {
			System.out.println("Number is power of two");
		} else {
			System.out.println("Number is not equal to power of two");
		}
		sc.close();
	}

	public static void main(String[] args) {
		powerOfTwo();
	}

}
