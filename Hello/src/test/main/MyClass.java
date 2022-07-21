// 이 클래스가 어느 package에 속해 있는지 package 예약어를 이용해서 명시해야한다.
package test.main;

// MyClass라는 이름의 클래스 정의하기
public class MyClass {
	// run 버튼을 눌렀을때 실행순서가 시작되는 특별한 main 메소드(main치고 ctrl&space 누르면 자동완성된다)
	public static void main(String[] args) throws Exception { // java에서는 함수가 아니라 메소드라고 한다!(javascript의 function과 같음)
		// 콘솔창에 문자열 출력하기
		System.out.println("Hello World!");
	}
}
