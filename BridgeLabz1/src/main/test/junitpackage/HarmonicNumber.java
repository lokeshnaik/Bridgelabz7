package junitpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class HarmonicNumber {

	
	
	@Test
	void test1()
	{
		float number=Utility.harmonicNumber(5);
		assertEquals(2.2833335,number,0.1);
	}
	
	@Test
	void test2()
	{
		float number=Utility.harmonicNumber(7);
		assertEquals(2.5928574,number,0.1);
	}
	@Test
	void test3()
	{
		float number=Utility.harmonicNumber(9);
		assertEquals(2.8289685,number,0.1);
	}
	@Test
	void test4()
	{
		float number=Utility.harmonicNumber(50);
		assertEquals(4.4992056,number,0.1);
	}
	@Test
	void test5()
	{
		float number=Utility.harmonicNumber(1);
		assertEquals(1.0,number,0.1);
	}

	

}
