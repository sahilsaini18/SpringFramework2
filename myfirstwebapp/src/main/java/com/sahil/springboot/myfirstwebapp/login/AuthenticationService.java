package com.sahil.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("Sahil");
		boolean isValidPassword = password.equalsIgnoreCase("saini");

		return isValidUserName && isValidPassword;
	}

}
