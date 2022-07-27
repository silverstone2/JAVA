package test.mypac;
/*
 * [ 생성자 ]
 * 
 * 1. 클래스명과 동일하다.
 * 2. 메소드 모양과 유사하지만 return type이 없다.
 * 3. 객체를 생성할 때 (new 할 때) 호출된다.
 * 4. 객체를 생성하는 시점에 무언가 준비 작업을 할 때 유용하다.
 * 5. 생성자를 명시적으로 정의하지 않아도 기본 생성자는 있다고 간주된다. 단, 하나라도 정의해버리면 기본 생성자는 없어진다.
 */
public class Student {
	// 생성자
	public Student() {
		System.out.println("Student 클래스의 생성자 호출됨");
	}
}
