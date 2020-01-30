package junitpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class EuclideanDistance {

	@Test
	void test()
	{
		float number=Utility.euclideanDistance(4,3);
		assertEquals(5.0,number);
	}
	@Test
	void test1()
	{
		float number=Utility.euclideanDistance(10,10);
		assertEquals(14.142136,number,0.1);
	}
	@Test
	void test2()
	{
		float number=Utility.euclideanDistance(7,8);
		assertEquals(10.630146,number,0.1);
	}
	@Test
	void test3()
	{
		float number=Utility.euclideanDistance(1,8);
		assertEquals( 8.062258,number,0.1);
	}
	@Test
	void test4()
	{
		float number=Utility.euclideanDistance(2,3);
		assertEquals(3.6055512,number,0.1);
	}

}
