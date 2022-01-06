package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class CalculatorTest {
	Calculator calculator;

	@BeforeAll
	public void beforeAll() {// here in the top before class if we use test instance a object is created and
								// it will be printed else we need to make that method as static
		System.out.println("From before all");
	}

	@BeforeEach
	void init() {
		calculator = new Calculator();
		System.out.println("new instance is created");
	}

	@AfterEach
	void afterCalculation() {
		System.out.println("Process completed");
	}

	@Test
	@DisplayName("Addition")
	void test() {

		assertEquals(4, calculator.addition(2, 2), "the method failed is addition");// here the first value is expected
																					// and the second value is our
		// entered value and statements is coustom statement and we can give anything
		System.out.println("Addition completed");
	}

	@Test
	@DisplayName("Multiplication")
	void multi() {
		assertEquals(10, calculator.multiplication(5, 2));
		System.out.println("multiplication done");
	}

	@Test
	@DisplayName("Area of circle")
	void areaOfCircle() {
		assertEquals(314.1592653589793, calculator.areaOfCircle(10));
	}

	@Test
	void division() {
		assertThrows(ArithmeticException.class, ()->calculator.division(10,0));

	}

}
