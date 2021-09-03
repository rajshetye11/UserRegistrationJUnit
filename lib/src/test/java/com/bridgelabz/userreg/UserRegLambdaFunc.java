package com.bridgelabz.userreg;

public class UserRegLambdaFunc {
	public static void main(String[] args) {
		
		//FirstName
		IRegistration firstName = (message) -> {
			String nameRegex = "^[A-Z][a-z]{2,}";
			if(message.matches(nameRegex))
				return true;
			else
				return false;
		};
		System.out.println("FirstName Validation");
		System.out.println("Raj is "+firstName.validate("Raj"));
		System.out.println("raj" +" is "+firstName.validate("raj"));
		System.out.println("Ra" +" is "+firstName.validate("Ra"));
		System.out.println("");
		
		
		//LastName
		IRegistration lastName = (message) -> {
			String nameRegex = "^[A-Z][a-z]{2,}";
			if(message.matches(nameRegex))
				return true;
			else
				return false;
		};
		System.out.println("LastName Validation");
		System.out.println("Shetye is "+lastName.validate("Shetye"));
		System.out.println("shetye" +" is "+lastName.validate("shetye"));
		System.out.println("sh" +" is "+lastName.validate("sh"));
		System.out.println("");
		
		

		//Password
		IRegistration password = (message) -> {
			String passwordRegex = "([A-Z]{1,12})([a-z]{1,12})([0-9]{1,12})([!@#$%^&*]{1})$";
			if(message.matches(passwordRegex))
				return true;
			else
				return false;
		};
		System.out.println("Password Validation");
		System.out.println("RAAJShetye11@ is "+password.validate("RAAJShetye11@"));
		System.out.println("shetye" +" is "+password.validate("shetye"));
		System.out.println("123456789" +" is "+password.validate("123456789"));
		System.out.println("");
		
		//Phone
		IRegistration phone = (message) -> {
			String phoneRegex = "^[0-9]{2,5}\\s[0-9]{10}";
			if(message.matches(phoneRegex))
				return true;
			else
				return false;
		};
		System.out.println("Mobile Validation");
		System.out.println("9169123456 "+phone.validate("9169123456"));
		System.out.println("91 1234567890" +" is "+phone.validate("91 1234567890"));
		System.out.println("112456" +" is "+phone.validate("112456"));
		System.out.println("");
		
		
		//Email
				IRegistration email = (message) -> {
					String emailRegex ="^[a-z]{3,10}[.+][a-zA-Z]{0,10}[@][a-z]{2,10}(.+)$";
					if(message.matches(emailRegex))
						return true;
					else
						return false;
				};
				System.out.println("Email Validation");
				System.out.println("raj.abc@xyz.com "+email.validate("raj.abc@xyz.com"));
				System.out.println("rajsh@cbak.com" +" is "+email.validate("rajsh@cbak.com"));
				System.out.println("112456" +" is "+email.validate("112456"));
				System.out.println("");
		
	}
	
	
	
	
}
