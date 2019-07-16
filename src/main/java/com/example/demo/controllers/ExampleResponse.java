package com.example.demo.controllers;

import java.util.Random;

import lombok.Data;

@Data
public class ExampleResponse {

	private final String message;
	private final String status;

	public static ExampleResponse buildRandom() {
		Random random = new Random();
		return buildRandom(String.format("Message %s", random.nextFloat()));
	}

	public static ExampleResponse buildRandom(String value) {
		Random random = new Random();
		return new ExampleResponse(value, String.valueOf(random.nextLong()));
	}

}
