package com.cg;
import java.util.regex.*;
import java.util.*;

//UC5
public class EmailAddressValidation {
	public static void ValidateEmail(String input) {
		String regex = "^[A-Z 0-9]+[A-Z 0-9 +._-]*[@][A-Z 0-9]+[.][A-Z]+[A-Z .]*$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(input);
		boolean found = matcher.find();
		if(found) {
			System.out.println("Email Address Validated");
		}
		else {
			System.out.println("Email Address Not Validated");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Email Address Validation!!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email address : ");
		String email = sc.nextLine();
		ValidateEmail(email);
	}
}
