package com.bridgelabz.userreg;

import java.util.regex.Pattern;

public class UserReg {
	
	private final String nameRegex = "^[A-Z][a-z]{3,}";
	private final String emailRegex = "^[a-z]{3,10}[.+][a-zA-Z]{0,10}[@][a-z]{2,10}(.+)$";
	private final String phoneRegex = "^[0-9]{2,5}\\s[0-9]{10}";
	private static final String passwordRegex = "([A-Z]{1,12})([a-z]{1,12})([0-9]{1,12})$";
	
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
	
	public boolean phone(String phone) {
		Pattern pattern = Pattern.compile(phoneRegex);
		return pattern.matcher(phone).matches();
	}
	
	public boolean password(String pass) {
		Pattern pattern = Pattern.compile(passwordRegex);
		return pattern.matcher(pass).matches();
	}
}
