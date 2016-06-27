package exam;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExamTest {
	
	Exam exam;
	
	@Before
	public void setup() {
		exam = new Exam();
	}
	
	@Test
	public void isNullTest() throws Exception {
		assertEquals(true, exam.isNull(""));
		assertEquals(true, exam.isNull(null));
		assertEquals(false, exam.isNull("1"));
		assertEquals(false, exam.isNull("100"));
	}
	
/*	
	@Test
	public void getSeparatorTest() throws Exception {
		String separator = exam.getSeparator("//i\n1i2i3");
		assertEquals("i", separator);
	}
*/
}
