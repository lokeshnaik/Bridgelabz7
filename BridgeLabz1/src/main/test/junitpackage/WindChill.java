package junitpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class WindChill {

	@Test
	void test()
	{
	  double number=Utility.windChill(45, 50);
	  assertEquals(32.82958045261027,number);
	}
	@Test
	void test1()
	{
	  double number=Utility.windChill(5, 10);
	  assertEquals(-9.737344294197477,number);
	}
	@Test
	void test2()
	{
	  double number=Utility.windChill(20, 50);
	  assertEquals(-2.6932497616351583,number);
	}
	@Test
	void test3()
	{
	  double number=Utility.windChill(25, 100);
	  assertEquals(-1.0854842795293678,number);
	}
	@Test
	void test4()
	{
	  double number=Utility.windChill(10, 10);
	  assertEquals(-3.5402167842280647,number);
	}

}
