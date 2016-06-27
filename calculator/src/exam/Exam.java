package exam;

import java.io.ObjectInputStream.GetField;
import java.util.List;

public class Exam {
	
	//
/*	
	public boolean isNull(String str) {
		if (str.equals("")) {
			return true;
		}
		if (str == null) {
			return true;
		}
		return false;
	}
*/	
	
	public boolean isNull(String str) {
		if(str == null) {
			return true;
		}
		if(str.equals("")) {
			return true;
		}
		if(str.isEmpty()) {
			return true;
		}
		return false;
	}
	
	// 구분자 추출
	// 커스텀 구분자가 들어올 경우  //*\n 형태로 들어오는가?
	public String getSeparator(String str) {
		
		return ";";
	}
	
	// 쪼개기
	public List<Integer> split(String str) {
		return null;
	}
	
	// 덧셈
	
	// 예외처리

}
