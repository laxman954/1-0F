package com.sample.codes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TestClass {

	public static void main(String[] args) throws IOException {
		//System.out.println(PostalCodeValidator.ukPostalCodeValidation("123 4567"));
		    BufferedReader reader = new BufferedReader(new FileReader("/To-Do/genius.todo"));
		    String line;
		    while ((line = reader.readLine()) != null)
		    {
		      System.out.println(line);
		    }

	}

}
