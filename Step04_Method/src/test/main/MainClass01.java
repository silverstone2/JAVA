package test.main;

import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		//MyObject 클래스에 정의된 3개의 메소드를 차례로 호출하는 code를 작성해 보세요.
		/*
		 * run 버튼을 눌렀을 때 MyObject 클래스에 정의된 3개의 메소드를 차례로 호출
		 * MyObject 클래스에는 3개의 non static 메소드가 있다
		 * 메소드명은 walk(), getNumber(), getGreeting()
		 * non static 메소드 이므로 호출하려면
		 * new MyObject() 해서 객체를 생성한 후 참조값에 . 을 찍어서 호출한다
		 */
		MyObject myobj = new MyObject();
		// return type 이 없는 메소드 호출
		myobj.walk();
		// return type 이 int 인 메소드 호출
		int a= myobj.getNumber(); // return 한다고 반드시 그 값을 반환받을 필요는 없다. 필요시에만 반환받아도 된다.
		// return type이 string 인 메소드 호출
		String b = myobj.getGreeting();
	}
}
