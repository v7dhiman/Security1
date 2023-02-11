package com.example.Security1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Security1Application {

	public static void main(String[] args) {
		SpringApplication.run(Security1Application.class, args);
	}

}

/*
	BE: Will verify the JSESSIONID cookie given by the FE.
		If the JSESSIONID is of authenticated user, it will not redirect to /login, else
		it will redirect to /login and after entering the credentials, a new logged in JSESSIONID
		will be given by the BE

	How is Session ID generated --> user, password

	Request comes to the BE
	1. JSESSIONID sent is of authenticated session/user
		BE work: verify the session id, return the response of the requested resource

	2. JSESSIONID sent is of unauthenticated session/user
		BE work: verify the session id, redirect to /login API
				 End user: Pass the credentials
		FE: Make a call to /login API with unauthenticated JSESSIONID + payload (username + password)
		BE: Verify on the basis of username and password, generate a new authenticated session
			and return the id of that as a set-cookie in the response header
 */

/*
   	Spring Security
   		1. In memory -->
   		2. General way -->
 */