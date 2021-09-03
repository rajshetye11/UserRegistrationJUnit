package com.bridgelabz.userreg;

import java.util.regex.Pattern;

public class UserReg {
	
	private final String nameRegex = "^[A-Z][a-z]{3,}";
	private final String emailRegex = "^[a-z]{3,10}[.+][a-zA-Z]{0,10}[@][a-z]{2,10}(.+)$";
	private final String phoneRegex = "^[0-9]{2,5}\\s[0-9]{10}";
	private static final String passwordRegex = "([A-Z]{1,12})([a-z]{1,12})([0-9]{1,12})([!@#$%^&*]{1})$";
	
	
	public boolean firstName(String name) throws UserRegException{
		Pattern pattern=Pattern.compile(nameRegex);
		try {
			if(name.length()<=0) {
				throw new UserRegException("FirstName cannot be empty");
			}
			if(pattern.matcher(name).matches()) {
				return true;
			}
			return false;
		}catch(NullPointerException e) {
			throw new UserRegException("Invalid Input");
		}
	}
	
	public boolean lastName(String lastName) throws UserRegException{
		Pattern pattern=Pattern.compile(nameRegex);
		try {
			if(lastName.length()<=0) {
				throw new UserRegException("LastName cannot be empty");
			}
			if(pattern.matcher(lastName).matches()) {
				return true;
			}
			return false;
		}catch(NullPointerException e) {
			throw new UserRegException("Invalid Input");
		}
	}
	
	
	public boolean email(String email) throws UserRegException{
		Pattern pattern=Pattern.compile(emailRegex);
		try {
			if(email.length()<=0) {
				throw new UserRegException("email cannot be empty");
			}
			if(pattern.matcher(email).matches()) {
				return true;
			}
			return false;
		}catch(NullPointerException e) {
			throw new UserRegException("Invalid Input");
		}
	}
	
	public boolean phone(String phone) throws UserRegException{
		Pattern pattern=Pattern.compile(phoneRegex);
		try {
			if(phone.length()<=0) {
				throw new UserRegException("email cannot be empty");
			}
			if(pattern.matcher(phone).matches()) {
				return true;
			}
			return false;
		}catch(NullPointerException e) {
			throw new UserRegException("Invalid Input");
		}
	}
	
	
	public boolean password(String password) throws UserRegException{
		Pattern pattern=Pattern.compile(passwordRegex);
		try {
			if(password.length()<=0) {
				throw new UserRegException("email cannot be empty");
			}
			if(pattern.matcher(password).matches()) {
				return true;
			}
			return false;
		}catch(NullPointerException e) {
			throw new UserRegException("Invalid Input");
		}
	}
	

}
