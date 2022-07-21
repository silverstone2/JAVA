package test.main;
/*
 *  java 에서 기본 데이터 type 8 개를 제외한 나머지는 모두 참조 데이터 type 이다.
 *  
 *  참조 데이터 type 객체는 heap영역(사물함영역) 에 만들어 진다.
 *  
 *  모든 객체는 저장소(필드)와 기능(메소드) 로 구성되어 있을 수 있다.
 *  어떤 저장소와 어떤 기능을 가지게 될지는 해당 type 객체가 어떻게 설계되었냐에 따라 다르다.
 *  
 *  참조값에 . 을 찍으면 저장소를 참조 하거나 기능을 사용할수 있다.
 *  참조값에 . 을 찍으면 필드를 참조 하거나 메소드를 호출할수 있다.(위의 설명과 같은 뜻)
 *  메소드 호출은 javascript 에서 함수 호출과 유사하다.
 */
public class MainClass08 {
	public static void main(String[] args) {
		String str = "abcde12345";
		int result = str.length();
		char result2 = str.charAt(5);
	}
}
