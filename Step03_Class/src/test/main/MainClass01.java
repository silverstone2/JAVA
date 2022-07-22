package test.main;


// 1. 객체를 생성하는데 필요한 클래스 import
import test.mypac.Calculator;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * 만일 프로그래밍의 목적이 '계산' 이라면 ?
		 * 
		 * - 계산 기능을 수행할 수 있는 객체가 필요하다.
		 * - 계산 기능을 수행할 수 있는 객체를 생성해서 heap 영역에 올려놓고
		 * - 참조값을 이용해서 계산을 해야 한다.
		 */
		
		// 2. 객체를 생성한다.
		Calculator cal = new Calculator();
		// heap 영역에서의 참조값이 들어옴(함수 아님) -> 이 참조값을 지역변수에 넣어야함 이 때 type은 클래스명이 type이 될 수 있다!
		
		// Calculator 객체의 exec() 메소드 호출하기
		cal.exec();
		cal.exec();
		cal.exec();
		
		// Calculator 객체의 brand 필드 참조하기
		String a = cal.brand; // 참조된 값을 변수에 대입하기
	}
}
