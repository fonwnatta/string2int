package com.example.appmanproject;

import java.util.Scanner;

public class AppmanprojectApplication {


	public static void main(String[] args) {

		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Enter your Letter: ");
		String sc = inputScanner.nextLine();

		int numberic  = AppmanprojectApplication.convertStringToInt(sc);

		System.out.println("The output should be " + numberic + "in interger");

	
	}

	public static int convertStringToInt (String letter){
		
		letter = letter.replaceAll("[^-?0-9]+", ""); //find number and replace alphabet
		
		return Integer.parseInt(letter);


	}

	
}
