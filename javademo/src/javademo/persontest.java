package javademo;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class persontest {
	int a;
	int b;
	int sum=0;
	int sub=0;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		person obj=new person();
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
	public void testadd() {
		sum=a+b;
		assertEquals("sum");
		
	}
	@Test
	public void testsub() {
		sub=a-b;
		assertEquals("sub");
		
	}

	private void assertEquals(String string) {
		// TODO Auto-generated method stub
		
	}

}
