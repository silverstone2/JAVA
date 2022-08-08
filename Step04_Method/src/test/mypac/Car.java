package test.mypac;

public class Car { //class의 접근지정자가 public이면 import만으로도 다른 패키지에서 불러오는게 가능하다
	
	// 생성자 ( 객체를 생성할 때 (new 할 때) 호출되는 부분)
	Car() { //클래스명() 의 형식으로 작성함. 메소드와는 비슷하게 생겼지만 return해주는 type을 적지 않는 차이가 있음
		// 바로 위에서 Car() 앞에 public을 빼주면 같은 패키지 안에서만 객체가 생성되는것(new)이 허용된다.
		System.out.println("Car 생성자 호출됨!");
	}
	
	// non static 메소드
	public void drive() {
		System.out.println("달려요!");
	}
}
