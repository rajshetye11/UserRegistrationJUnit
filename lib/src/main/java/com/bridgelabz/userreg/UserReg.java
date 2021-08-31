package com.bridgelabz.userreg;

import java.util.regex.Pattern;

public class UserReg {
	
	private final String nameRegex = "^[A-Z][a-z]{3,}";
	
	public boolean firstName(String name) {
		Pattern pattern = Pattern.compile(nameRegex);
		return pattern.matcher(name).matches();
	}
}
