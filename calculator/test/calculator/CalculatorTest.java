package calculator;

// import static *
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.add(3, 4);
//		System.out.println(result);
		assertEquals(7, result);
	}

}
