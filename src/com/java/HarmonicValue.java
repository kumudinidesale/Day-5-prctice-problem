package com.java;

import java.util.Scanner;

public class HarmonicValue {
	public static void main(String[] args) {
		System.out.print("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("" + "Harmonic Number is : ");
		double result = 0;
		while (num > 0) {
			result = result + (double) 1 / num;
			num--;
			System.out.println(result + "  ");
		}
		System.out.println("");
		System.out.println(" Harmonic Series is " + result);
		sc.close();
	}

}
