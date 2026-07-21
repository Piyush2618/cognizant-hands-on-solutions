package com.cognizant.spring_learn.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class JwtUtil {

	private static final String SECRET = "ChangeThisSecretKeyToAStrongValueOfAtLeast32Bytes!";
	private static final SecretKey KEY = Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8));

	public static String generateToken(String username) {
		long nowMillis = System.currentTimeMillis();
		Date now = new Date(nowMillis);
		Date exp = new Date(nowMillis + 10 * 60 * 1000); // 10 minutes

		return Jwts.builder()
				.setSubject(username)
				.setIssuedAt(now)
				.setExpiration(exp)
				.signWith(KEY)
				.compact();
	}
}
