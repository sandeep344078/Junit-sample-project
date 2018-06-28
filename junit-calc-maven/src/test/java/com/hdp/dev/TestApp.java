package com.hdp.dev;

import org.junit.Assert;
import org.junit.Test;

public class TestApp {
	@Test
	public void testPrintHelloWorld() {
		Assert.assertEquals(App.getHelloWorld(), "Hello World");
	}

	@Test
	public void testPrintHelloWorld2() {
		Assert.assertEquals(App.getHelloWorld2(), "Hello World 2");
	}
}
