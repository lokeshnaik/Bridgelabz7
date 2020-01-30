package junitpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class SquareRoot {

	@Test
	void test()
	{
		double number=Utility.squareRoot(64);
		assertEquals(8.0,number);
	}
	@Test
	void test1()
	{
		double number=Utility.squareRoot(100);
		assertEquals(10.0,number);
	}
	@Test
	void test2()
	{
		double number=Utility.squareRoot(25);
		assertEquals(5.0,number);
	}
	@Test
	void test3()
	{
		double number=Utility.squareRoot(110);
		assertEquals(10.488088481701515,number);
	}
	@Test
	void test4()
	{
		double number=Utility.squareRoot(49);
		assertEquals(7.000000000000002,number);
	}

}
