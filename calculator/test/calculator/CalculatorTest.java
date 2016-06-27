package calculator;

// import static *
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
//	Calculator calculator = new Calculator();
	Calculator calculator;
	
	@Before
	public void setup() {
		calculator = new Calculator();
	}
	
	@Test
	public void testAdd() {
		int result = calculator.add(3, 4);
//		System.out.println(result);
		assertEquals(7, result);
	}
	
	@Test
	public void testMinus() {
		assertEquals(1, calculator.minus(4, 3));
	}
	
	@After
	public void tearDown() {
		System.out.println("tearDown");
	}

}
