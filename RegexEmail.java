package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
	public static void main(String[] args) {
	String regex_for_Email = "[0-9a-zA-Z]+([+._-]{1}[0-9a-zA-Z]+)?@[0-9a-zA-Z]+[.]{1}[a-zA-z]{2,4}([.]{1}[a-zA-z]{2,3})?$"
				+ "";

		Pattern pattern = Pattern.compile(regex_for_Email);

		Matcher matcher1 = pattern.matcher("abc@yahoo.com");
		Matcher matcher2 = pattern.matcher("abc.100@yahoo.com");
		Matcher matcher3 = pattern.matcher("abc111@abc.com");
		Matcher matcher4 = pattern.matcher("abc-100@abc.net");
		Matcher matcher5 = pattern.matcher("abc.100@abc.com.au");
		Matcher matcher6 = pattern.matcher("abc-100@yjkjahoo.om");
		Matcher matcher7 = pattern.matcher("abc@1.com");
		Matcher matcher8 = pattern.matcher("abc@gmail.com.com");
		Matcher matcher9 = pattern.matcher("abc+100@gmail.com");
		Matcher matcher10 = pattern.matcher("abc");
		Matcher matcher11 = pattern.matcher("abc@.com.my");
		Matcher matcher12 = pattern.matcher("abc123@gmail.a");
		Matcher matcher13 = pattern.matcher("abc123@.com");
		Matcher matcher14 = pattern.matcher("abc123@.com.com");
		Matcher matcher15 = pattern.matcher(".abc@abc.com");
		Matcher matcher16 = pattern.matcher("abc()*@gmail.com");
		Matcher matcher17 = pattern.matcher("abc@%*.com");
		Matcher matcher18 = pattern.matcher("abc..2002@gmail.com");
		Matcher matcher19 = pattern.matcher("abc.@gmail.com");
		Matcher matcher20 = pattern.matcher("abc@abc@gmail.com");
		Matcher matcher21 = pattern.matcher("abc@gmail.com.1a");
		Matcher matcher22 = pattern.matcher("abc@gmail.com.aa.au");

		System.out.println("Email 1 Valid : " + matcher1.matches());
		System.out.println("Email 2 Valid : " + matcher2.matches());
		System.out.println("Email 3 Valid : " + matcher3.matches());
		System.out.println("Email 4 Valid : " + matcher4.matches());
		System.out.println("Email 5 Valid : " + matcher5.matches());
		System.out.println("Email 6 Valid : " + matcher6.matches());
		System.out.println("Email 7 Valid : " + matcher7.matches());
		System.out.println("Email 8 Valid : " + matcher8.matches());
		System.out.println("Email 9 Valid : " + matcher9.matches());
		System.out.println("Email 10 Valid : " + matcher10.matches());
		System.out.println("Email 11 Valid : " + matcher11.matches());
		System.out.println("Email 12 Valid : " + matcher12.matches());
		System.out.println("Email 13 Valid : " + matcher13.matches());
		System.out.println("Email 14 Valid : " + matcher14.matches());
		System.out.println("Email 15 Valid : " + matcher15.matches());
		System.out.println("Email 16 Valid : " + matcher16.matches());
		System.out.println("Email 17 Valid : " + matcher17.matches());
		System.out.println("Email 18 Valid : " + matcher18.matches());
		System.out.println("Email 19 Valid : " + matcher19.matches());
		System.out.println("Email 20 Valid : " + matcher20.matches());
		System.out.println("Email 21 Valid : " + matcher21.matches());
		System.out.println("Email 22 Valid : " + matcher22.matches());

	}

}
