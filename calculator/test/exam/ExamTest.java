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
	
	@Test
	public void splitTest() throws Exception {
		String[] str = new String[2];
		str[0] = "1";
		str[1] = "2";
		assertEquals(str, exam.split("1,2"));
	}
	
	@Test
	public void returnOneTest() throws Exception {
		assertEquals(5, exam.returnOne("5"));
	}
	
	@Test
	public void plusTest() throws Exception {
		assertEquals(3, exam.plus("1,2"));
		assertEquals(6, exam.plus("1,2,3"));
		assertEquals(10, exam.plus("1,2,3\n4"));
		assertEquals(15, exam.plus("1,2,3\n4:5"));
	}
	
	@Test
	public void customSeparatorTest() throws Exception {
	}
	
/*	
	@Test
	public void getSeparatorTest() throws Exception {
		String separator = exam.getSeparator("//i\n1i2i3");
		assertEquals("i", separator);
	}
*/
}
