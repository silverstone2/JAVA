package test.main;


/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		// 정수형 변수 선언하고 값 대입하기
		byte iByte = 10;
		short iShort = 10;
		int iInt = 10000;
		long iLong = 10;
		
		/*
		 * int type 변수에 byte type 변수에 담긴 내용을 대입한다면?
		 * - 표현 가능 범위가 좁은 변수에 담긴 값을 표현 가능 범위가 더 넓은 변수에
		 * 	 대입 하는 것은 없다
		 * - 따라서 에러를 발생 시키지 않는다
		 */
		
		int tmp = iShort;
		
		/*
		 * 표현 가능한 범위가 더 넓은 변수에 담긴 내용을 대입하려면
		 * 명시적으로 casting을 해야한다
		 * (type)은 type casting 연산자이다
		 */
		
		byte tmp2 = (byte)iInt;
		// 선언한 type의 크기를 초과하기 때문에 에러 발생. 때문에 = 바로 뒤에 (byte)라고 표현해주면 type이 변경됨 이를 캐스팅이라함
		// 단 캐스팅은 타입을 변경했을 때 값이 타입의 범위를 벗어나지 않아야만 함
		// 문법상의 오류는 없지만 컴파일 시 다른 값이 들어오거나 오류가 발생할 수 있음
		
		// 실수형 변수 선언하고 값 대입하기
		float num1 = 10.1f;
		double num2 = 10.2d; // d 는 생략이 가능하다.
		double num3 = 10/3; // d, f 를 붙이지 않으면 double type 으로 간주된다.
		
		// float type 에 있는 값을 double type로 담기
		double tmp3 = num1;
		
		float tmp4 = (float)num2;

	}
}
