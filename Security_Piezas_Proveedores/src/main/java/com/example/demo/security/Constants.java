package com.example.demo.security;

public class Constants {

	// Spring Security

	public static final String LOGIN_URL = "/login";
	public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
	public static final String TOKEN_BEARER_PREFIX = "Bearer ";

	// JWT

	public static final String ISSUER_INFO = "Oscar herran";
	public static final String SUPER_SECRET_KEY = "Boopcamp123456Boopcamp123456Boopcamp123456Boopcamp123456Boopcamp123456";
	public static final long TOKEN_EXPIRATION_TIME = 864_000_000; // 10 day

}