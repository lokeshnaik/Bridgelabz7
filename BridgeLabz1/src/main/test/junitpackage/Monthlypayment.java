package junitpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class Monthlypayment {

	@Test
	void test() {
		double number=Utility.monthlyPayment(500, 6, 10);
		assertEquals(9.262918887885263,number);
	}
	@Test
	void test1() {
		double number=Utility.monthlyPayment(1000, 5, 10);
		assertEquals(21.24704471126833,number);
	}
	@Test
	void test2() {
		double number=Utility.monthlyPayment(10000, 6, 5);
		assertEquals(161.04932661450974,number);
	}
	@Test
	void test3() {
		double number=Utility.monthlyPayment(5000, 5, 10);
		assertEquals(106.23522355634165,number);
	}
	@Test
	void test4() {
		double number=Utility.monthlyPayment(7000, 10, 10);
		assertEquals(92.50551581723334,number);
	}

}
