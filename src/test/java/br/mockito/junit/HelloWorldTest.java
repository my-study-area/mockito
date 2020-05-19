package br.mockito.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {
	
	@Test
	public void deveRetornarAMessagemHelloWorld() {
		HelloWorld hello = new HelloWorld();
		hello.setMessage("Hello World!");
		String expectedMessage = hello.getMessage();
		String message = hello.getMessage();
		assertEquals( expectedMessage, message);
	}
	
	@Test
	public void deveRetornarAMessagemOlaMundo() {
		HelloWorld hello = new HelloWorld();
		hello.setMessage("Ola Muundo!");
		String expectedMessage = hello.getMessage();
		String message = hello.getMessage();
		assertEquals( expectedMessage, message);
	}

}
