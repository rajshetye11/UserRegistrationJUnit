package com.bridgelabz.userreg;

import java.util.regex.Pattern;

public class UserReg {
	
	private final String nameRegex = "^[A-Z][a-z]{3,}";
	private final String emailRegex = "^[a-z]{3,10}[.+][a-zA-Z]{0,10}[@][a-z]{2,10}(.+)$";
	
	public boolean firstName(String name) {
		Pattern pattern = Pattern.compile(nameRegex);
		return pattern.matcher(name).matches();
	}
	
	public boolean lastName(String lastname) {
		Pattern pattern = Pattern.compile(nameRegex);
		return pattern.matcher(lastname).matches();
	}
	
	public boolean email(String email) {
		Pattern pattern = Pattern.compile(emailRegex);
		return pattern.matcher(email).matches();
	}
}
