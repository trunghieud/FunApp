package com.sqa.td;

import com.sqa.td.helpers.*;

public class FunApp {

	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName("Java Fundamentals");
		checkNumberAgainst10();
		checkMonth();
		checkGradeValue();
		AppBasics.farewellUser(name);
	}

	private static void checkGradeValue() {
		System.out.println("3. Check for Grade Value");
		double num = AppBasics.requestInt("\nCan I get a grade value(1-100)?");
		char grade = 'A';
		if (num >= 90.0) {
			System.out.println("You got an A!");
		} else if (num >= 80.0) {
			System.out.println("You got a B!");
		} else if (num >= 70.0) {
			System.out.println("You got a C!");
		} else if (num >= 60.0) {
			System.out.println("You got a D! Please come see me.");
		} else {
			System.out.println("You got a F! Please come see me.");
		}
	}

	private static void checkMonth() {
		System.out.println("2. Check for Month to switch");
		String month = AppBasics.requestString("\nCan I get a number for the month?");
		month = String.valueOf(month);
		switch (month) {
		case "1":
			System.out.println("It is January.");
			break;
		case "2":
			System.out.println("It is February.");
			break;
		case "3":
			System.out.println("It is March.");
			break;
		case "4":
			System.out.println("It is April.");
			break;
		case "5":
			System.out.println("It is May.");
			break;
		case "6":
			System.out.println("It is June.");
			break;
		case "7":
			System.out.println("It is July.");
			break;
		case "8":
			System.out.println("It is August.");
			break;
		case "9":
			System.out.println("It is September.");
			break;
		case "10":
			System.out.println("It is October.");
			break;
		case "11":
			System.out.println("It is November.");
			break;
		case "12":
			System.out.println("It is December.");
			break;
		default:
			System.out.println("This is not a valid month. Please pick a number from 1-12.");
			break;
		}
	}

	private static void checkNumberAgainst10() {
		System.out.println("1. Check for number against 10");
		int num = AppBasics.requestInt("\nCan I get a number to check against 10?");
		if (num > 10) {
			System.out.println("The number is greater than 10");
		} else if (num < 10) {
			System.out.println("The number is less than 10");
		} else
			System.out.println("The number is equal to 10");
	}
}
