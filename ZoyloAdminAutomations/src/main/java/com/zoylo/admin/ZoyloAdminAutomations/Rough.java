package com.zoylo.admin.ZoyloAdminAutomations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rough {
	
	static Scanner scan;
	
	public static void main(String[] args) throws FileNotFoundException {
		
	}
	
	public static void buttonRedirection(String input) {
		System.out.println("Test case:");
		System.out.println("Press "+input+" button");
	
	}
	
	public static String textboxFill(String input) {
		return "Enter"+ input + " in the textbox.";
	}
	
	public static void redirectionResult(String response) {
		System.out.println("page redirects to "+response+" page");
	}
}
