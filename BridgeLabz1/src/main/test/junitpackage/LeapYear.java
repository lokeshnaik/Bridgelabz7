package junitpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class LeapYear {

	@Test
	void test() 
	{
		int number=Utility.leapYear(2020);
		assertEquals(1,number);
	}
	@Test
	void test1() 
	{
		int number=Utility.leapYear(2010);
		assertEquals(0,number);
	}
	@Test
	void test2() 
	{
		int number=Utility.leapYear(200);
		assertEquals(2,number);
	}
	@Test
	void test3() 
	{
		int number=Utility.leapYear(2000);
		assertEquals(1,number);
	}
	@Test
	void test4() 
	{
		int number=Utility.leapYear(1996);
		assertEquals(1,number);
	}

}
