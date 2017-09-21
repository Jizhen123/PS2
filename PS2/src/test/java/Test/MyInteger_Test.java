package Test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pkgEmpty.MyInteger;

public class MyInteger_Test {
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testiValue1() {
		MyInteger integer1 = new MyInteger(1);
		boolean prime = true;
		assertFalse(integer1.isEven());
		assertTrue(integer1.isOdd());
		assertEquals(integer1.isPrime(),prime);
		
		MyInteger integer2 = new MyInteger(2);
		assertTrue(integer2.isEven());
		assertFalse(integer2.isOdd());

		boolean equals = true ;
		assertEquals(integer1.equals(1),equals);
		
		boolean equals1 = false ;
		assertEquals(integer2.equals(3),equals1);
		
		boolean isEven = false;
		boolean isOdd = true;
		boolean isPrime = true;

		assertEquals(isEven, integer1.isEven());
		assertEquals(isOdd, integer1.isOdd());
		assertEquals(isPrime, integer1.isPrime());
	}
}
