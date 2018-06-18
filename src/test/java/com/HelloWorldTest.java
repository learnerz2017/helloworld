package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void getContentTest() {
		HelloWorld hw = new HelloWorld();
		String content = "Hello world!";
		assertEquals(content, hw.getContent());
	}

}
