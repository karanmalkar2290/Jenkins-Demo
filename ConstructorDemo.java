package com.demo;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

public class ConstructorDemo {

	public ConstructorDemo() {
		this(1);
		System.out.println("In Parent class default constructor");
	}

	public ConstructorDemo(int a) {
		
		System.out.println("In Parent class parameterized constructor");
	}

	public static void main(String[] args) {

		Child child = new Child();

	}
	
	public void doNothing() {
		System.out.println("Nothing");
	}
}

class Child extends ConstructorDemo {
	public Child() {
		this(1234, "");
		System.out.println("In Child class default constructor");
	}

	public Child(int a, String b) {

		System.out.println("In Child class parameterized constructor");
	}
}
//	public static String getSHA512Hash(String input) {
//	    try {
//	        // Create a MessageDigest instance for SHA-512
//	        MessageDigest md = MessageDigest.getInstance("SHA-512");
//
//	        // Digest the input and return the hash bytes
//	        byte[] hashBytes = md.digest(input.getBytes(StandardCharsets.UTF_8));
//
//	        // Convert the hash bytes to a hexadecimal string
//	        StringBuilder sb = new StringBuilder();
//	        for (byte b : hashBytes) {
//	            sb.append(String.format("%02x", b));
//	        }
//
//	        return sb.toString();
//	    } catch (NoSuchAlgorithmException e) {
//	        throw new RuntimeException(e);
//	    }
//	}
