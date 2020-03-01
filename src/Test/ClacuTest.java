package Test;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Code.Calculator;

//import CalcPackage.Calculator;

public class ClacuTest {

	static Calculator cal;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cal=new Calculator();
		System.out.print("Before All Test Cases, The same object, I use it ");
        System.out.print("\n");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.print("After All Test Cases, The same object, Don't write any thing inside it except This massege ");
        System.out.print("\n");

	}

	@Before
	public void setUp() throws Exception {
		System.out.print("Before Each Test Case, Different objects, I Don't write it ");
        System.out.print("\n");

	}

	@After
	public void tearDown() throws Exception {
		System.out.print("After Each Test Case, Different objects, I Don't use it ");
        System.out.print("\n");

	}

	@Test (timeout=10)
	public void Addtest_twoPosInt_PosInt() {
		int actual= cal.add(3, 4);
		assertTrue(actual==7);
        System.out.println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");
        System.out.println("two positive");

	}
	@Test
	public void Addtest_twoNegInt_NegInt() {
		int actual= cal.add(-2, -7);
		assertTrue(actual==-9);
        System.out.println("two Negative");

	}
	@Test
	public void Addtest_DifferentSignsAndEqualEachOther_Zero() {
		int actual= cal.add(-5, 5);
		assertTrue(actual==0);
        System.out.println("SAME");

	}
	@Test
	public void Addtest_DifferentSignsAndNegIsLarger_NegInt() {
		int actual= cal.add(-5, 2);
		assertTrue(actual==-3);
        System.out.println("Neg Larger");

	}
	@Test
	public void Addtest_DifferentSignsAndPosIsLarger_PosInt() {
		int actual= cal.add(9,-2 );
		assertTrue(actual==7);
        System.out.println("Pos Larger");

	}

}
