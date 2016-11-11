package com.gabriel.jadenToUpper;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JadenToUpper {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Input some text: ");
		String input = scanner.nextLine();
		
		System.out.println(toJadenCase(input));
		System.out.println(toJadenCaseOptional(input));

	}
	//java 8 way
	public static String toJadenCase(String phrase) {
		// TODO put your code below this comment
		if(phrase == null || phrase == ""){
			return null;
		}
		
		return Arrays.stream(phrase.split(" "))
				.map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
				.collect(Collectors.joining(" "));
//		
	
	}
	//This is a non-java 8 way to write this method
	public static String toJadenCaseOptional(String phrase){
		
		if(phrase == null || phrase == ""){
			return null;
		}
		
		String[] words = phrase.split(" ");
		
		int size = words.length;
		String result = "";
		int count = 1;
		
		for(String word: words){
			String firstLetter = word.substring(0, 1).toUpperCase();
		  	word = firstLetter + word.substring(1, word.length());

		  	if(count < size){
		  		result += word + " ";
		  		count++;
		  	}else{
		  		result += word;
		  	}
		  	
		   	
		}
		return result;
	}
}
