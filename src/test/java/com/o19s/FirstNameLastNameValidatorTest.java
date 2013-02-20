package com.o19s;

import static org.junit.Assert.*;

import org.apache.lucene.util.automaton.Automaton;
import org.apache.lucene.util.automaton.BasicOperations;
import org.junit.Test;

public class FirstNameLastNameValidatorTest {

	@Test
	public void test() {
		String[] firstNames = {"Doug", "John"};
		String[] lastNames = {"Turnbull", "Berryman"};
		
		Automaton auto = FirstNameLastNameValidator.createNameValidator(firstNames, lastNames);
		assertTrue(BasicOperations.run(auto, "Doug   Turnbull"));
		assertTrue(BasicOperations.run(auto, "Doug\t\tBerryman"));		
		assertTrue(BasicOperations.run(auto, "Turnbull,  Doug"));
		assertTrue(BasicOperations.run(auto, "Berryman, John"));		

		assertFalse(BasicOperations.run(auto, "DougBerryman"));		
	}

}
