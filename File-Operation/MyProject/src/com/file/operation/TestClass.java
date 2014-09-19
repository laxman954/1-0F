package com.file.operation;
import java.io.IOException;

import com.sample.codes.PostalCodeValidator;


public class TestClass {

	public static void main(String[] args) throws IOException {
		System.out.println(PostalCodeValidator.ukPostalCodeValidation("123 4567"));
	}

}
