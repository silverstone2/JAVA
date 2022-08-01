package test.main;

import java.util.Random;

public class MainClass07 {
	
	/*
	 * [랜덤한 정수를 하나 얻어내서 콘솔창에 출력하는 프로그래밍을 하고 싶다]

		필요한 객체
		1. 랜덤한 정수를 만들어주는 객체 -> new Random();
		2. 콘솔창에 문자열을 출력해주는 객체 -> System.out (system에 있는 out이라는 스태틱 필드를 의미)
	 */		
	
	public static void main(String[] args) {
		// Random type 참조값이 담길 수 있는 ran이라는 이름의 빈 지역변수 만들기
		Random ran = null;
		// Random 객체를 생성해서 그 참조값을 지역변수 ran 에 대입하기
		ran = new Random();
		// 어떠한 걸 새로 선언할 때는 별도의 값을 입력하지 않아도 new와 같이 전달된다. random()처럼
		// 참조값에 . 찍어서 nextInt() 메소드를 호출하고 메소드가 리턴해주는 값을 지역변수 ranNum 에 담기
		int ranNum = ran.nextInt(); //ran 안에 있는 참조값을 찾아가겠다는 의미
		// ranNum 변수에 담긴 값을 콘솔창에 출력해보기
		System.out.println(ranNum);
	}
}