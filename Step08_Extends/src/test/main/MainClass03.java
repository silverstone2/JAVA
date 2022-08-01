package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		// HandPhone 객체를 생성해서 그 참조값을 p1이라는 이름의 HandPhone type 지역변수에 대입하기
		HandPhone p1 = new HandPhone();
				
		// p1 안에 있는 참조값을 p2라는 Phone type 지역 변수에 대입하기
		Phone p2 = p1;
				
		// p1 안에 있는 참조값을 p3 라는 Object type 지역 변수에 대입하기
		Object p3 = p1;
		
		// 동일한 객체임에도 불구하고 어떤 type으로 변수를 받았느냐에 따라 사용할 수 있는 메소드가 달라진다.
	}
}
