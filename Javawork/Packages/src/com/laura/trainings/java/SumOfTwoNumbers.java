package com.laura.trainings.java;
import java.util.Scanner;



public class SumOfTwoNumbers {
	
	public static void main(String[] args) {
		System.out.println("Ingrese 2 numeros:");
		Scanner scanner = new Scanner(System.in);
		int num1 = Integer.parseInt(scanner.next());
		int num2 = Integer.parseInt(scanner.next());
		
		System.out.println("La suma es:"+ (num1+num2));
	}
}
